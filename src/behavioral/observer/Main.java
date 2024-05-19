package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1", "Laptop", 100, 10340.50);

        Customer customer1 = new Customer("C1", "Alice");
        Customer customer2 = new Customer("C2", "Bob");
        Customer customer3 = new Customer("C2", "Charlie");

        product1.registerObserver(customer1);
        product1.registerObserver(customer2);
        product1.registerObserver(customer3);

        System.out.println("Product is currently out of stock.");
        product1.setQuantity(0);

        System.out.println("\nUpdating product stock status...");
        product1.setQuantity(50);
    }
}
