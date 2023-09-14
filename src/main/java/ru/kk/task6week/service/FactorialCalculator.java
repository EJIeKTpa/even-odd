package ru.kk.task6week.service;

import java.util.Scanner;

public class FactorialCalculator {
    public static void factorialCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое неотрицательное число для вычисления факториала: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Факториал числа " + number + " равен " + result + ".");
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++)
            result *= i;
        return result;
    }
}