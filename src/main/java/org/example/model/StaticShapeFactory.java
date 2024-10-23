package org.example.model;

import org.example.service.cache.BasicShapeCache;
import org.example.service.cache.ShapeCache;
import org.example.service.cache.UniqueCache;

public class StaticShapeFactory {

    private static ShapeCache shapeCache;

    public static void InitializeCache(ShapeCache cache){
        shapeCache = cache;
    }

    public static void InitializeUniqueCache(){
        shapeCache = new UniqueCache();
    }
    public static void InitializeBasicCache(){
        shapeCache = new BasicShapeCache();
    }

    public static Shape makeShape(String shapeType, float dimension){

        switch(shapeType){
            case "CIRCLE" ->{
                return shapeCache.saveShape(new Circle(dimension));
            }
            case "SQUARE" ->{
                return shapeCache.saveShape(new Square(dimension));
            }
            default -> throw new IllegalArgumentException("Nie ma takiego typu: "+ shapeType);
        }

    }
}
