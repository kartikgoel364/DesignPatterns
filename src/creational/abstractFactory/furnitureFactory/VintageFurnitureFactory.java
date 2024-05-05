package creational.abstractFactory.furnitureFactory;

import creational.abstractFactory.furnitureInterfaces.Chair;
import creational.abstractFactory.furnitureInterfaces.CoffeeTable;
import creational.abstractFactory.furnitureInterfaces.Sofa;
import creational.abstractFactory.vintrageFurniture.VintageChair;
import creational.abstractFactory.vintrageFurniture.VintageCoffeeTable;
import creational.abstractFactory.vintrageFurniture.VintageSofa;

public class VintageFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VintageCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }
}
