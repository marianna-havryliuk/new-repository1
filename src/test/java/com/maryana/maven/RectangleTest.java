package com.maryana.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    private final Rectangle rectangle = new Rectangle(20,40);

    @Test
    void testPerimeter() {
        assertEquals(120, rectangle.calculatePerimeter());
    }

    @Test
    void testSquare() {
        assertEquals(800, rectangle.calculateSquare());
    }
}
