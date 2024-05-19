package creational.abstractFactory.vintrageFurniture;

import creational.abstractFactory.furnitureInterfaces.CoffeeTable;

public class VintageCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Sitting Coffee on a vintage coffee table.");
    }
}
