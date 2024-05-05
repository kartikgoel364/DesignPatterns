package creational.abstractFactory.modernFurniture;

import creational.abstractFactory.furnitureInterfaces.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Putting Coffee on a modern coffee table.");
    }
}
