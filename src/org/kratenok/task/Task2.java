package org.kratenok.task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (scan.hasNextInt()) {
                array[i] = scan.nextInt();
                sum = sum + array[i];
                System.out.println("В элемент под номером " + i + " записано значение " + array[i]);

            } else {
                System.out.println("Вы ввели неверное значение " + scan.next());
                System.out.println("Попробуйте еще раз");

                i--;
            }
        }
        System.out.println("Среднее арифметическое элементов " + sum/array.length);
    }
}


