package org.example.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

//zwykla lista
//2 - cache ktory zapisuje tylko unikatowe shapy
// cahce ktory zapisuje unikatowe shapy i jak ktos chce stworzyc shapa, ktory istnieje to zwraca mu ten isntejacy

public class BasicShapeCache implements ShapeCache {

    List<Shape> shapes;

    public BasicShapeCache(){
        shapes = new ArrayList<>();
    }

    @Override
    public void saveShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public Collection<Shape> getAllShapes() {
        return shapes;
    }
}
