package creational.singleton;

public class SingletonWithEagerInitialization {
    private static final SingletonWithEagerInitialization instance = new SingletonWithEagerInitialization();

    private SingletonWithEagerInitialization() {
        // Private Constructor to prevent instantiation from outside the class
    }

    // Static method to get the single instance of the class
    public static SingletonWithEagerInitialization getInstance() {
        return instance;
    }
}
