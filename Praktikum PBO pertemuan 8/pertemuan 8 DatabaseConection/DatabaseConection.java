public class DatabaseConection {
    private static DatabaseConection instance = null;
    private DatabaseConection() {
    System.out.println("Database connection created.");
    }
    public static DatabaseConection getInstance() {
    if (instance == null) {
    instance = new DatabaseConection();
    }
    return instance;
    }
    }