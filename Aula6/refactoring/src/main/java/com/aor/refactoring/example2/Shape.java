package com.aor.refactoring.example2;

public abstract class Shape {
    enum TYPE {RECTANGLE, CIRCLE}

    private TYPE type;
    private double x;
    private double y;
    private double width;  // ONLY FOR RECTANGLES
    private double height; // ONLY FOR RECTANGLES

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea() throws Exception ;

    public abstract double getPerimeter() throws Exception;

    public abstract void draw(GraphicFramework graphics);

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
