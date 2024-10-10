public class Sedan extends Mobil {

    public Sedan(String nama) {
        super(nama);
    }

    @Override
    public void klakson() {
        System.out.println("Tiin");
    }
}