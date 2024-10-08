package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ShapeFactory {

    private ShapeCache shapeCache;

    public Shape makeShape(String shapeType, float dimension){
        Shape shape;
        switch(shapeType){
            case "CIRCLE" ->{
                shape = new Circle(dimension);
            }
            case "SQUARE" ->{
                shape =  new Square(dimension);
            }
            default -> throw new IllegalArgumentException("Nie ma takiego typu: "+ shapeType);
        }
        shapeCache.saveShape(shape);
        return shape;
    }

}
