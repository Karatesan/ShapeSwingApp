package org.example.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//zwykla lista
//2 - cache ktory zapisuje tylko unikatowe shapy
// cahce ktory zapisuje unikatowe shapy i jak ktos chce stworzyc shapa, ktory istnieje to zwraca mu ten isntejacy

public class BasicShapeCache implements ShapeCache {

    List<Shape> shapes;

    public BasicShapeCache() {
        shapes = new ArrayList<>();
    }

    @Override
    public Shape saveShape(Shape shape) {

        shapes.add(shape);
        return shape;
    }

    @Override
    public Collection<Shape> getAllShapes() {
        return shapes;
    }
}
