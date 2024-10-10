public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4); 
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " Dog sedang bermain.");
    }

    @Override
    public void eat() {
        System.out.println(name + " Dog sedang makan.");
    }

    @Override
    public void walk() {
        System.out.println(name + " Dog sedang berjalan.");
    }
}
