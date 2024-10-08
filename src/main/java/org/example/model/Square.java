package org.example.model;

import lombok.Data;

import java.util.Objects;

@Data
public class Square implements Shape {

    private float bok;

    public Square() {
    }

    public Square(float side) {
        this.bok = side;
    }

    @Override
    public double calculateObwod() {
        return 4 * bok;
    }

    @Override
    public double calculatePole() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Float.compare(bok, square.bok) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bok);
    }
}
