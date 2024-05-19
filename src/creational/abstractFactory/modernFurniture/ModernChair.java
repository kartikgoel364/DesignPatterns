package creational.abstractFactory.modernFurniture;

import creational.abstractFactory.furnitureInterfaces.Chair;

public class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}
