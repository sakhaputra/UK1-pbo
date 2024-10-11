// Kendaraan.java
public class Kendaraan {
    protected String merk;
    protected int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String informasi() {
        return "Kendaraan " + merk + ", tahun " + tahun;
    }

    public String berjalan() {  // Polimorfisme
        return "Kendaraan bergerak";
    }
}

class Mobil extends Kendaraan {
    private String tipe;

    public Mobil(String merk, int tahun, String tipe) {  // Constructor Overloading
        super(merk, tahun);
        this.tipe = tipe;
    }

    @Override
    public String berjalan() {  // Overriding
        return "Mobil " + merk + " bergerak maju.";
    }

    @Override
    public String informasi() {  // Overriding
        return "Mobil " + merk + ", tahun " + tahun + ", tipe " + tipe;
    }
}
