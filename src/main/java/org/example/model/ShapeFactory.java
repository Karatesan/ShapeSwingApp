package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.service.cache.ShapeCache;


@Data
@AllArgsConstructor
public class ShapeFactory {

    private ShapeCache shapeCache;

    public Shape makeShape(ShapeType shapeType, float... dimensions){

        switch(shapeType){
            case CIRCLE ->{
                return shapeCache.saveShape(new Circle(dimensions[0]));
            }
            case SQUARE ->{
                return shapeCache.saveShape(new Square(dimensions[0]));
            }
            case RECTANGLE -> {
                return shapeCache.saveShape(new Rectangle(dimensions[0],dimensions[1]));
            }
            default -> throw new IllegalArgumentException("Nie ma takiego typu: "+ shapeType);
        }

    }

}
