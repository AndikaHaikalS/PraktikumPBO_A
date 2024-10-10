public class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Hewan " + legs + " Kaki.");
    }

    public void eat() {
        System.out.println("animal Makan.");
    }
}