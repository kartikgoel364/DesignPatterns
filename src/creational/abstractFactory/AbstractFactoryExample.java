package creational.abstractFactory;

import creational.abstractFactory.enums.FurnitureStyle;
import creational.abstractFactory.furnitureFactory.FurnitureFactory;
import creational.abstractFactory.furnitureInterfaces.Chair;
import creational.abstractFactory.furnitureInterfaces.CoffeeTable;
import creational.abstractFactory.furnitureInterfaces.Sofa;

public class AbstractFactoryExample {
    public static void main(String[] args) {

        // Create modern furniture
        FurnitureFactory modernFactory = FurnitureFactoryProducer.getFactory(FurnitureStyle.MODERN);
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        // use the modern furniture
        modernChair.sitOn();
        modernSofa.relaxOn();
        modernCoffeeTable.putCoffee();

        //Create vintage furniture
        FurnitureFactory vintageFactory = FurnitureFactoryProducer.getFactory(FurnitureStyle.VINTAGE);
        Chair vintageChair = vintageFactory.createChair();
        Sofa vintageSofa = vintageFactory.createSofa();
        CoffeeTable vintageCoffeeTable = vintageFactory.createCoffeeTable();

        // use the vintage furniture
        vintageChair.sitOn();
        vintageSofa.relaxOn();
        vintageCoffeeTable.putCoffee();
    }
}
