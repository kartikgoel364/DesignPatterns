package creational.factory;

import creational.factory.shapes.Shape;

public class FactoryExample {
    public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     Shape circle = shapeFactory.getShape("CIRCLE");
     circle.draw();

     Shape rectangle = shapeFactory.getShape("RECTANGLE");
     rectangle.draw();
    }
}
