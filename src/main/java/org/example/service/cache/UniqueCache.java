package org.example.service.cache;

import org.example.model.Shape;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UniqueCache implements ShapeCache {

    private Map<Shape, Shape> shapes;

    public UniqueCache() {
        shapes = new HashMap<>();
    }

    @Override
    public Shape saveShape(Shape shape) {

        Shape existingShape = shapes.putIfAbsent(shape, shape);
        return existingShape == null ? shape : existingShape;
    }

    @Override
    public Collection<Shape> getAllShapes() {
        return shapes.values();
    }
}
