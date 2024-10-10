public class App {

    public static void main(String[] args) {
        Binatang kambing = new Binatang("kambing");
        Kucing mudreg = new Kucing("mudreg");
        Cemeng mocha = new Cemeng("mocha");

        kambing.bersuara();  
        mudreg.bersuara();   
        mocha.bersuara();    
    }
}