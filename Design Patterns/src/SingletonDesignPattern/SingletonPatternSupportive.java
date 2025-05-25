package SingletonDesignPattern;

public class SingletonPatternSupportive {
    public static void call() {
        SingletonDatabase singleton = SingletonDatabase.getInstance("varun", "abcd1234");
        if (SingletonDatabase.getInstance("varun", "abcd1234") == singleton) {
            System.out.println("Singleton is already initialized");
        } else {
            System.out.println("Singleton is not already initialized");
        }

        singleton.connectToDatabase();
        singleton.disconnectFromDatabase();

        //Enums in JAVA are thread-safe
        //They can be serialized with only one object
        //Enums are loaded in memory when enum type is loaded.
        // So enum class is instantiated only once.
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE.getSingletonEnum();
    }
}
