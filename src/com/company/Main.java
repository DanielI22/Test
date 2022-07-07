package com.company;

import Parallel.MyRunnable;
import Parallel.MySemaphore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
//        List<Integer> mylist = new ArrayList<>();
//        mylist.add(2);
//        mylist.add(4);
//        ListPrinter.print(Collections.singletonList(mylist));
//
//        List<Shape> shapes = new ArrayList<>();
//        Shape triangle = new Triangle(4);
//        Shape circle = new Circle(3);
//        Shape square = new Square(2);
//        shapes.add(triangle);
//        shapes.add(circle);
//        shapes.add(square);
//
//        AreaPrinter.print(shapes);
//
//        Box<Triangle> box = new Box<>(new Triangle(2));
//        box.print();

        MySemaphore semaphore=new MySemaphore(1);
        new Thread(new MyRunnable(semaphore),"Thread-1").start();
        new Thread(new MyRunnable(semaphore),"Thread-2").start();
        new Thread(new MyRunnable(semaphore),"Thread-3").start();
    }
}
