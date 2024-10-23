package org.example.model;

public class Rectangle implements Shape{

    private double sideA;
    private  double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() {
    }

    @Override
    public double calculateObwod() {
        return 0;
    }

    @Override
    public double calculatePole() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
