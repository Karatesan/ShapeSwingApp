//package org.example.service;
////comparing key extractor pokazuje sie pole ktore zostanie uzyte do porownania
//import org.example.model.Shape;
//
//import java.util.Comparator;
//import java.util.Optional;
//
//public class ShapeService {
//
//
//    public Shape getHighestObwod(ShapeCache cache){
//
//        Optional<Shape> shape = cache.getAllShapes().stream()
//                .max(Comparator.comparing(s -> s.calculateObwod()));
//        return shape.orElse(null);
//    }
//
//
//}
