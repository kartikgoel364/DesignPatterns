package creational.factory;

import creational.factory.shapes.Circle;
import creational.factory.shapes.Rectangle;
import creational.factory.shapes.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
      if (shapeType.equalsIgnoreCase("RECTANGLE")) {
          return new Rectangle();
      } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
          return new Circle();
      }
      return null;
    }
}
