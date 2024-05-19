package creational.singleton;

public class SingletonWithThreadSafeInitialization {
    // Private static variable to hold the single instance of the class
    private static volatile SingletonWithThreadSafeInitialization instance;

    private SingletonWithThreadSafeInitialization() {
        // Private Constructor to prevent instantiation from outside the class
    }

    // Static method to get the single instance of the class
    public static SingletonWithThreadSafeInitialization getInstance() {
        // Thread Safe Initialization: create the instance if it hasn't been created yet
        if (instance == null) {
            synchronized (SingletonWithThreadSafeInitialization.class) {
              if (instance == null) {
                  instance = new SingletonWithThreadSafeInitialization();
              }
            }
        }
        return instance;
    }
}
