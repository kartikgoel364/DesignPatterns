package creational.abstractFactory.vintrageFurniture;

import creational.abstractFactory.furnitureInterfaces.Chair;

public class VintageChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Vintage chair.");
    }
}
