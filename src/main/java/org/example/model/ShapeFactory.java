package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ShapeFactory {

    private ShapeCache shapeCache;

    public Shape makeShape(String shapeType, float dimension){

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
