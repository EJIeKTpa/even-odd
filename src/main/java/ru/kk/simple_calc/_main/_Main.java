package ru.kk.simple_calc._main;

import ru.kk.simple_calc.service.FactorialCalculator;
import ru.kk.simple_calc.service.MethodWhile;
import ru.kk.simple_calc.service.Number;
import ru.kk.simple_calc.service.WeekendCheck;

public class _Main {
    public static void main(String[] args) {
        FactorialCalculator.factorialCalculator();
        Number.number();
        WeekendCheck.dayofweek();
        MethodWhile.methodWithWhileLoop();
        MethodWhile.methodWithDoWhileLoop();
    }
}