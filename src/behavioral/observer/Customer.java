package behavioral.observer;

public class Customer implements Observer {
    String customerId;
    String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    @Override
    public void update(String productId) {
        System.out.println("Hello, " + name + "! The product '" + productId + "' is now back in stock.");
    }
}
