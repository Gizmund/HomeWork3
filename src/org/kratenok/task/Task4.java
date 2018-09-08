package org.kratenok.task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            if (scan.hasNextInt()) {
                array[i] = scan.nextInt();

               // System.out.println("В элемент под номером " + i + " записано значение " + array[i]);

            } else {
                System.out.println("Вы ввели неверное значение " + scan.next());
                System.out.println("Попробуйте еще раз");

                i--;
            }
        }
        Integer zeros = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeros++;
            }
        }

        System.out.println("Количество нулей: " + zeros);

    }
}
