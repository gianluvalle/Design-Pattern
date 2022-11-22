package it.unikey.view;

import it.unikey.entities.Shape;
import it.unikey.utils.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape shapeSquare = shapeFactory.getShape("square");
        shapeSquare.draw();

        Shape shapeCircle = shapeFactory.getShape("circle");
        shapeCircle.draw();

    }
}