package org.example.model;

import lombok.Data;

@Data
public class Circle implements Shape {

    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateObwod() {
        return 2*3.14*radius;
    }

    @Override
    public double calculatePole() {
        return 0;
    }
}
