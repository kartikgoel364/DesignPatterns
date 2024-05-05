package creational.abstractFactory.furnitureFactory;

import creational.abstractFactory.furnitureInterfaces.Chair;
import creational.abstractFactory.furnitureInterfaces.CoffeeTable;
import creational.abstractFactory.furnitureInterfaces.Sofa;

// Abstract Factory Interface
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
