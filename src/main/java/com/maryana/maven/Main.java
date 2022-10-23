package com.maryana.maven;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20, 40);
        rectangle.viewRectangle();

        System.out.println("Perimeter of the Rectangle, P = " + rectangle.calculatePerimeter());

        System.out.println("Square of the Rectangle, S = " + rectangle.calculateSquare());

    }
}

