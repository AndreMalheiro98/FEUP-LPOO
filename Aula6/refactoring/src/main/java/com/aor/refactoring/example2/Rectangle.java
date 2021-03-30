package com.aor.refactoring.example2;

public class Rectangle extends Shape{
    private double width,height;

    public Rectangle(double x,double y, double width, double height){
        super(x,y);
        this.height=height;
        this.width=width;
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawLine(getX(), getY(), getX() + width, getY());
        graphics.drawLine(getX() + width, getY(), getX() + width, getY() + height);
        graphics.drawLine(getX() + width, getY() + height, getX(), getY() + height);
        graphics.drawLine(getX(), getY() + height, getX(), getY());
    }

    @Override
    public double getArea() throws Exception {
        return width * height;
    }

    @Override
    public double getPerimeter() throws Exception {
        return 2 * (width + height);
    }
}
