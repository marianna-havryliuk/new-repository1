package com.maryana.maven;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20, 40);
        rectangle.viewRectangle();

        System.out.println("P = " + rectangle.calculatePerimeter());

        System.out.println("S = " + rectangle.calculateSquare());

    }
}

