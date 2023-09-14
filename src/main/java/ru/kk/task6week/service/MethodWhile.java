package ru.kk.task6week.service;

public class MethodWhile {
    public static void methodWithWhileLoop() {
        int num = 1;
        System.out.print("Using while : ");
        while (num <= 512) {
            System.out.print(num + " ");
            num = num * 2;
        }
        System.out.println();
    }

    public static void methodWithDoWhileLoop() {
        int num = 1;
        System.out.print("Using do..while : ");
        do {
            System.out.print(num + " ");
            num = num * 2;
        } while (num <= 512);
        System.out.println();
    }
}

