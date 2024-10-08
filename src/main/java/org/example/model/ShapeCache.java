package org.example.model;

import java.util.Collection;

public interface ShapeCache {

    public Shape saveShape(Shape shape);
    public Collection<Shape> getAllShapes();
   // public Shape getShape(String shapeType, )
}
