package ru.shipov;

/**
 * Написать программу, вычисляющую для любых натуральных m и r, таких что r ≤ m, значение функции
 * f(m,r)=m!/r!(m-r)!
 */

public class Main2 {

    public static void main(String[] args) {
        System.out.println(calculate(1, 1));
        System.out.println(calculate(2, 1));
        System.out.println(calculate(1, 2));
        System.out.println(calculate(4, 1));
        System.out.println(calculate(5, 5));
    }

    private static int calculate(int m, int r) {
        int factorialM = factorial(m);
        int factorialR = factorial(r);
        int factorialMR = factorial(m - r);

        return factorialM / (factorialR * factorialMR);
    }

    public static int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++)
            fact *= i;
        return fact;
    }
}
