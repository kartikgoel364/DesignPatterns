package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    String productId;
    String name;
    int quantity;
    double price;
    List<Observer> observerList;

    public Product(String productId, String name, int quantity, double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
      for(Observer observer : observerList) {
        observer.update(productId);
      }
    }

    public boolean isInStock() {
       return quantity > 0;
    }

    public void setQuantity(int quantity) {
        if (this.quantity == 0 && quantity > 0) {
            notifyObservers();
        }
        this.quantity = quantity;
    }
}
