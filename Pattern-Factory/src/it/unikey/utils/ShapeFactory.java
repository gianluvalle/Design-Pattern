package it.unikey.utils;

import it.unikey.entities.Shape;
import it.unikey.entities.Circle;
import it.unikey.entities.Rectangle;
import it.unikey.entities.Square;

public class ShapeFactory extends ShapeFactoryAbstract{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        return null;
    }
}
