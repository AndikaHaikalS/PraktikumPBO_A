public class App {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        bd.luas();
        bd.keliling();

        Lingkaran lk = new Lingkaran(15);
        System.out.println("Luas lingkaran: " + lk.luas());
        System.out.println("keliling lingkaran: " + lk.keliling());

        Persegi pj = new Persegi(10);
        System.out.println("Luas Bujur Sangkar: " + pj.luas());
        System.out.println("keliling Bujur Sangkar: " + pj.keliling());

        Segitiga sg = new Segitiga(10, 8);
        System.out.println("Luas Segitiga: " + sg.luas());
        
        sg.keliling();
    }
}