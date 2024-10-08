package org.example;

import org.example.model.*;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShapeCache shapeCache = new UniqueCache();
        ShapeFactory f = new ShapeFactory(shapeCache);
        Shape circle = f.makeShape("CIRCLE", 10f);
        Shape circle2 = f.makeShape("CIRCLE", 10f);
        Circle c = (Circle) circle;
        System.out.println(c);
        c.radius=30;
        System.out.println(shapeCache.getAllShapes());











//        ShapeCache shapeCache = new ShapeCache();
//        ShapeFactoryI factory = new ShapeFactory(shapeCache);
//        ShapeService service = new ShapeService();
//        Shape circle = factory.makeShape(ShapeType.CIRCLE, 1F);
//        Shape square = factory.makeShape(ShapeType.SQUARE, 12F);
//        Shape square2 = factory.makeShape(ShapeType.SQUARE, 5F);
//        System.out.println(shapeCache.getAllShapes());
//
//        System.out.println(service.getHighestObwod(shapeCache));

    }
}