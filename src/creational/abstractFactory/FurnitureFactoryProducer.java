package creational.abstractFactory;

import creational.abstractFactory.enums.FurnitureStyle;
import creational.abstractFactory.furnitureFactory.FurnitureFactory;
import creational.abstractFactory.furnitureFactory.ModernFurnitureFactory;
import creational.abstractFactory.furnitureFactory.VintageFurnitureFactory;

public class FurnitureFactoryProducer {
    public static FurnitureFactory getFactory(FurnitureStyle furnitureStyle) {
        switch (furnitureStyle) {
            case MODERN:
                return new ModernFurnitureFactory();
            case VINTAGE:
                return new VintageFurnitureFactory();
            default:
                throw new IllegalArgumentException("Invalid furniture style: " + furnitureStyle);
        }
    }
}
