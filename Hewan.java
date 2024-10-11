// Hewan.java
public class Hewan {
    private String nama;  // Encapsulation

    public Hewan(String nama) {
        this.nama = nama;
    }

    public String getNama() {  // Getter
        return nama;
    }

    public void setNama(String nama) {  // Setter
        this.nama = nama;
    }

    public String suara() {  // Polimorfisme
        return "Tidak ada suara";
    }
}

class Anjing extends Hewan {
    private String breed;

    public Anjing(String nama, String breed) {  // Constructor Overloading
        super(nama);
        this.breed = breed;
    }

    @Override
    public String suara() {  // Overriding
        return "Guk guk!";
    }

    public String informasi() {  // Polimorfisme
        return "Anjing bernama " + getNama() + ", breed " + breed;
    }
}

class Kucing extends Hewan {
    private String warna;

    public Kucing(String nama, String warna) {  // Constructor Overloading
        super(nama);
        this.warna = warna;
    }

    @Override
    public String suara() {  // Overriding
        return "Meow!";
    }

    public String informasi() {  // Polimorfisme
        return "Kucing bernama " + getNama() + ", warna " + warna;
    }
}
