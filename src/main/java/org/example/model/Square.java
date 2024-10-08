package org.example.model;

import lombok.Data;

@Data
public class Square implements Shape{

    private float bok;

    public Square(){}
    public Square(float side){
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
