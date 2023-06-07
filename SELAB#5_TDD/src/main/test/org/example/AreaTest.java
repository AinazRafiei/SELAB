package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaTest {

    @Test
    void main() {
        int height = 3;
        int width = 5;
        MyRectangle rectangle = new MyRectangle(height, width);
        assertEquals(height*width, rectangle.getArea());
        height = 10;
        rectangle.setHeight(height);
        assertEquals(height*width, rectangle.getArea());
    }
}