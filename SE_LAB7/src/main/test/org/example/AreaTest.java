package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaTest {

    @Test
    void main(int height, int width) {
        MyRectangle rectangle = new MyRectangle(height, width);
        assertEquals(6, rectangle.getArea);
    }
}