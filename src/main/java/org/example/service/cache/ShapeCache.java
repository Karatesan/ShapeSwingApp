package org.example.service.cache;

import org.example.model.Shape;

import java.util.Collection;

public interface ShapeCache {

    public Shape saveShape(Shape shape);
    public Collection<Shape> getAllShapes();
   // public Shape getShape(String shapeType, )
}
