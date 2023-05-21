package org.example;

public class Apple {

    private double weight;
    private Color color;

    public Apple(double weight, String color) {
        this.weight = weight;
        this.color = Color.valueOf(color);
    }

    public double getWeight() {
        return this.weight;
    }

    public Color getColor() {
        return this.color;
    }
}
