package com.example.interface_repository.arv;

public class Shape {

    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
