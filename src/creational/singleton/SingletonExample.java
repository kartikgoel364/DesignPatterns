package creational.singleton;

public class SingletonExample {
    public static void main(String[] args) {

        SingletonWithLazyInitialization singletonWithLazyInitialization = SingletonWithLazyInitialization.getInstance();
        System.out.println("Hello Singleton - LazyInitialization! " + singletonWithLazyInitialization);

        SingletonWithEagerInitialization singletonWithEagerInitialization = SingletonWithEagerInitialization.getInstance();
        System.out.println("Hello Singleton - EagerInitialization! " + singletonWithEagerInitialization);

        SingletonWithThreadSafeInitialization singletonWithThreadSafeInitialization = SingletonWithThreadSafeInitialization.getInstance();
        System.out.println("Hello Singleton - ThreadSafeInitialization! " + singletonWithThreadSafeInitialization);
    }
}