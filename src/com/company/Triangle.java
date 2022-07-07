package com.company;

public class Triangle implements Shape{
    private int side;

    public Triangle(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println(side*side);
    }
}
