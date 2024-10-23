package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
/**
 * Use static fields of this factory to initialize shapes
 */
public class ShapeFactory {

    private ShapeCache shapeCache;
    /**
     *
     * @param  shapeType enum ShapeType
     * @param dimensions dimensions of shape
     * @return returns new or existing shape
     * @throws IllegalArgumentException when provided shapeType does not exist
     */
    //varargs - to jest po prostu tablica zmiennych
    public Shape makeShape(ShapeType shapeType, double... dimensions){

       // if(dimensions.length==0) throw
        Shape shape;
        switch(shapeType){
            case CIRCLE ->{
                if(dimensions.length==1)
                    shape = new Circle(dimensions[0]);
                else throw new IllegalArgumentException("Niewlasciwa ilosc wymiarow dla Shape typu: "+ shapeType.name());
            }
            case SQUARE ->{
                shape =  new Square(dimensions[0]);
            }
            case RECTANGLE -> {
                shape = new Rectangle(dimensions[0], dimensions[1]);
            }
            default -> throw new IllegalArgumentException("Nie ma takiego typu: "+ shapeType);
        }
        shapeCache.saveShape(shape);
        return shape;
    }

}
