package com.maryana.maven;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20, 40);
        rectangle.viewRectangle();

        System.out.println("Perimeter of the Rectangle, P = (h + l) * 2 = " + rectangle.calculatePerimeter());

        System.out.println("Square of the Rectangle, S = h * l = " + rectangle.calculateSquare());

    }
}

