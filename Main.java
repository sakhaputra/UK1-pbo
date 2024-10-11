// Main.java
public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Anjing
        Anjing anjing1 = new Anjing("Buddy", "Golden Retriever");
        System.out.println(anjing1.informasi());
        System.out.println("Suara: " + anjing1.suara());

        // Instansiasi objek Kucing
        Kucing kucing1 = new Kucing("Mimi", "Putih");
        System.out.println(kucing1.informasi());
        System.out.println("Suara: " + kucing1.suara());

        // Instansiasi objek Mobil
        Mobil mobil1 = new Mobil("Toyota", 2020, "SUV");
        System.out.println(mobil1.informasi());
        System.out.println("Aksi: " + mobil1.berjalan());
    }
}
