public class Main {
    public static void main(String[] args) {
        MobilSport jaguar = new MobilSport("Jaguar");

        for (int i = 1; i <= 5; i++) {
            jaguar.gigi(i);
        }

   
        for (int t = 1; t <= 5; t++) {
            jaguar.gigi(5, t);
        }
    }
}