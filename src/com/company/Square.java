package com.company;

public class Square implements Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println(side * 2);
    }
}
