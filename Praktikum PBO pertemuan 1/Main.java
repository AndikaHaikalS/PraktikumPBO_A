public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Andika", 20,"JLN DUKU");
        person1.displayInfo();

        person1.setName("kalzz");
        person1.setAge(17);
        person1.setaddress("JLN MAJU");

        System.out.println("Sudah Diubahh: ");
        person1.displayInfo();

    }
}  

