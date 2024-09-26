package com.tibin.practice.util;

public class ArrayPrinter {
    public static <T>  void print(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
    }
}
