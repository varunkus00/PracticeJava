package SingletonDesignPattern;

public class SingletonDatabase {

    private String username;
    private String password;
    private static SingletonDatabase instance;

    private SingletonDatabase(String username, String password) {
        this.username = username;
        this.password = password;
    }
    private SingletonDatabase(SingletonDatabase singleton) {}

    public static SingletonDatabase getInstance(String username, String password) {

        if(instance == null) {
            synchronized (SingletonDatabase.class) {
                if(instance == null) {
                    instance = new SingletonDatabase(username, password);
                }
            }
        }
        return instance;

    }

    public void connectToDatabase() {
        System.out.println("Connecting to database...");
    }

    public void disconnectFromDatabase() {
        System.out.println("Disconnecting from database...");
    }
}
