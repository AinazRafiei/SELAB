package org.example;

public class MySquare {
    private int side;

    public MySquare(int side) {
        this.side= side;

    }

    public void setSide(int side) {
        this.side = side;
    }


    public int getSide() {
        return side;
    }


    public int getArea() {
        return this.getSide()* this.getSide();
    }
}
