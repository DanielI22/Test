package com.company;

import java.util.List;

public class AreaPrinter {
    public static void print(List<? extends Shape> shapes) {
        for(Shape currentShape: shapes) {
            if(currentShape instanceof Circle) {
                System.out.println("Its a circle");
            }
            currentShape.area();
            System.out.println(currentShape.getClass().getSimpleName());
        }
    }
}
