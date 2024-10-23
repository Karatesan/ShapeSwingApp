package org.example.model;

import lombok.Data;

@Data
public class Square implements Shape{

    private double bok;

    public Square(){}
    public Square(double side){
        this.bok = side;
    }

    @Override
    public double calculateObwod() {
        return  4*bok;
    }

    @Override
    public double calculatePole() {
        return 0;
    }
}
