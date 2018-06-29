package ru.shipov;

/**
 * 1.Написать программу, которая выводит числа от 1 до 100, но вместо чисел кратных 2 нужно выводить строку Two,
 * вместо чисел кратных 7 - строку Seven, вместо чисел кратных 2 и 7 - строку TwoSeven.
 */

public class Main1 {
    private static final String TWO = "Two";
    private static final String SEVEN = "Seven";

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 14 == 0)
                System.out.println(TWO + SEVEN);
            else if (i % 2 == 0)
                System.out.println(TWO);
            else if (i % 7 == 0)
                System.out.println(SEVEN);
            else
                System.out.println(i);
        }
    }
}
