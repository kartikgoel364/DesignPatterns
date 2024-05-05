package creational.abstractFactory.modernFurniture;

import creational.abstractFactory.furnitureInterfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on a modern Sofa");
    }
}
