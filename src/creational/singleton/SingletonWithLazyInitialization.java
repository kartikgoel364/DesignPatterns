package creational.singleton;

public class SingletonWithLazyInitialization {

   // Private static variable to hold the single instance of the class
   private static SingletonWithLazyInitialization instance;

    private SingletonWithLazyInitialization() {
        // Private Constructor to prevent instantiation from outside the class
    }

    // Static method to get the single instance of the class
    public static SingletonWithLazyInitialization getInstance() {
      // Lazy initialization: create the instance if it hasn't been created yet
      if (instance == null) {
          instance = new SingletonWithLazyInitialization();
      }
      return instance;
    }

}
