package com.example.interface_repository.arv;

public class Square extends Shape {

    private double height;
    private double width;

    public Square(String shapeName, double height, double width) {
        super(shapeName);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Name=" + shapeName +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
