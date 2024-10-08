package org.example.model;

import lombok.Data;

import java.util.Objects;

@Data
public class Circle implements Shape {

    public double radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculateObwod() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double calculatePole() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
