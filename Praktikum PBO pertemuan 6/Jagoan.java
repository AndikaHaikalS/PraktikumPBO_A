public class Jagoan {
    String nama;
    Jubah Jubah;
    Senjata Senjata;
    int kesehatan = 100;

    public Jagoan(String nama, Jubah Jubah, Senjata Senjata) {
        this.nama = nama;
        this.Jubah = Jubah;
        this.Senjata = Senjata;
    }

    public void serang(Jagoan lawan) {
        int kerusakan = Senjata.damage + Jubah.pertahanan;
        lawan.kesehatan -= kerusakan;
        System.out.println(nama + " menyerang " + lawan.nama + " dengan " + Senjata.nama + "!");
        System.out.println(lawan.nama + " kehilangan " + kerusakan + " poin kesehatan. Kesehatan " + lawan.nama + ": " + lawan.kesehatan);
    }

    public void status() {
        System.out.println("Jagoan: " + nama + ", Kesehatan: " + kesehatan + ", Jubah: " + Jubah.nama + ", Senjata: " + Senjata.nama);
    }
}