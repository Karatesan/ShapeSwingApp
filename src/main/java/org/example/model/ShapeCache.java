package org.example.model;

import java.util.Collection;
import java.util.List;

public interface ShapeCache {

    public void saveShape(Shape shape);
    public Collection<Shape> getAllShapes();
   // public Shape getShape(String shapeType, )
}
