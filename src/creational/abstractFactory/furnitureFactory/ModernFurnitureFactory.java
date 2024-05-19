package creational.abstractFactory.furnitureFactory;

import creational.abstractFactory.furnitureInterfaces.Chair;
import creational.abstractFactory.furnitureInterfaces.CoffeeTable;
import creational.abstractFactory.furnitureInterfaces.Sofa;
import creational.abstractFactory.modernFurniture.ModernChair;
import creational.abstractFactory.modernFurniture.ModernCoffeeTable;
import creational.abstractFactory.modernFurniture.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
