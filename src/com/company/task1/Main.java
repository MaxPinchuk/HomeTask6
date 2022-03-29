package com.company.task1;

/**
 * Написать цикл for от 0 до 100.
 * Вывести все цифры, кроме 13 и 66.
 */

public class Main {

    public static void main(String[] args) {

        int d = 0;
        for (int i = 0; i < 100; i++) {
            d += i;

            if (i > 100) {
                System.out.println("BREAK");
                break;
            }
            if (i == 13) {
                System.out.println(" ");
                continue;
            }
            if (i == 66) {
                System.out.println(" ");
                continue;
            }
            System.out.println("Current i = " + i);
        }
        System.out.println("Sum = " + d);
    }
}