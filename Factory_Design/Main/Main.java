package Factory_Design.Main;

import Factory_Design.Shape.Shape;
import Factory_Design.Shape_Factory.ShapeFactory;

public class Main {
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape = shapeFactory.getShape("Square");
        shape.draw();
    }
}
