package org.kratenok.task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            if (scan.hasNextInt()) {
                array[i] = scan.nextInt();

                System.out.println("В элемент под номером " + i + " записано значение " + array[i]);

            } else {
                System.out.println("Вы ввели неверное значение " + scan.next());
                System.out.println("Попробуйте еще раз");

                i--;
            }
        }

       /* for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);
        }*/

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        Integer element1 = array[0];
        Integer element2 = array[9];
        array[0] = element2;
        array[9] = element1;

        for (int i = 0; i < array.length ; i++) {
            System.out.print(" "+array[i]);
        }
    }
}


