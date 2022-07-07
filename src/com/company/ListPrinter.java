package com.company;

import java.util.List;

public class ListPrinter {
    public static void print(List<? extends List> list){
        for (Object element : list){
            System.out.println(element);
        }
    }
}
