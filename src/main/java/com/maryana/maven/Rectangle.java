package com.maryana.maven;

public class Rectangle {
    private int length;
    private int height;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void viewRectangle() {
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }

    public double calculatePerimeter () {
        return (getLength() + getHeight()) * 2;
    }

    public double calculateSquare () {
        return getHeight() * getLength();
    }

}
