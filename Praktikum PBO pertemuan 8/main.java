public class main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "Author A", "111");
        Book book2 = new Book("Advanced Java", "Author B", "222");
        Book book3 = new Book("Main Java", "Author c", "333");
        Book.displayTotalBooks();
    }
}