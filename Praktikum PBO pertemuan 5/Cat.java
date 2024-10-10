public class Cat implements Pet { 
    String Name;
    @Override
    public void setName(String name) {
        System.out.println("name cat:" + name);
    }

    @Override
    public void play() {
        System.out.println("Cat play");
    }

    public void Eat() {
        System.out.println("Cat eat");
    }

    public void Walk() {
        System.out.println("Cat walk");
    }

    @Override
    public String getName() {
        
        return this.Name;
    }

}
