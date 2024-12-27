package Factory_Design.Shape_Factory;

import Factory_Design.Shape.Circle;
import Factory_Design.Shape.Rectangle;
import Factory_Design.Shape.Shape;
import Factory_Design.Shape.Square;

public class ShapeFactory {
    public Shape getShape(String input)
    {
        switch(input)
        {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }


}
