public class Main {
    public static void main(String[] args) {
        
        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);

       
        Senjata golok = new Senjata("Golok", 25);
        Senjata toya = new Senjata("Toya", 24);

        
        Jagoan jakaSembung = new Jagoan("Jaka Sembung", jubahPutih, golok);
        Jagoan pitung = new Jagoan("Si Pitung", jubahHitam, toya);

        
        jakaSembung.serang(pitung);
        jakaSembung.serang(pitung);
        pitung.serang(jakaSembung);
        jakaSembung.serang(pitung);
        pitung.serang(jakaSembung);

        
        System.out.println("\nStatus Akhir:");
        jakaSembung.status();
        pitung.status();
    }
}