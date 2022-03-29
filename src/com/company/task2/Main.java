package com.company.task2;

/**
 * Написать цикл for от 0 до 100.
 * Создать переменную int над циклом равную 1.
 * Каждую итерацию цикла умножать эту переменную на i, и сохранять в ней результат умножения
 * Если результат превысит 1000, вывести результат на экран и завершить работу программ
 */

public class Main {

    public static void main(String[] args) {

        int sum = 1;
        for (int i = 1; i < 100; i++) {
            sum *= i;
            if (sum > 1000) {
                System.out.println(sum);
                break;
            }
        }
    }
}