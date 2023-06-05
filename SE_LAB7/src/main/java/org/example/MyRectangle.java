package org.example;

public class MyRectangle extends MySquare {



    private int secondSide;

    public MyRectangle(int height, int width) {
        super(height);
        this.secondSide = width;

    }

    public void setHeight(int height) {
        super.setSide(height);
    }

    public void setWidth(int width) {
        this.secondSide = width;
    }

    public int getHeight() {
        return super.getSide();
    }

    public int getWidth() {
        return secondSide;
    }

    public int getArea() {
        return this.getHeight() * this.getWidth();
    }
}
