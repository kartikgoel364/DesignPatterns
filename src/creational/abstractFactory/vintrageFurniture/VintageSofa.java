package creational.abstractFactory.vintrageFurniture;

import creational.abstractFactory.furnitureInterfaces.Sofa;

public class VintageSofa implements Sofa {
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on a vintage Sofa");
    }
}
