package com.SBOL.lessons;
import com.SBOL.lessons.lesson_3.Task_1;
import com.SBOL.lessons.lesson_4.Task_2;
import com.SBOL.lessons.lesson_5.Task_3;
import com.SBOL.lessons.lesson_6.Task_4;

import java.util.Scanner;
public class Main {

    private static final Scanner str = new Scanner(System.in);

    public static void main(String[] args) {

        int i;
        do {
            System.out.println("Меню выбора задания, введите из клавиатуры число из списка:");
            System.out.println("1. Домашнее задание 3.");
            System.out.println("2. Домашнее задание 4.");
            System.out.println("3. Домашнее задание 5.");
            System.out.println("4. Домашнее задание 6.");
            System.out.println("5. Домашнее задание 7.");
            System.out.println("0. Выход");

            i = readInput();

            switch (i) {
                case 1:
                    Task_1.menu();
                    break;
                case 2:
                    Task_2.menu();
                    break;
                case 3:
                    Task_3.menu();
                    break;
                case 4:
                    Task_4.menu();
                    break;
                case 5:
                    //Task_3.menu();
                    break;
                case 0:
                    break;
            }
        }
        while (i != 0);
    }

    public static int readInput() {
        return str.nextInt();

    }

    public static double readInputDouble() {
        return str.nextDouble();

    }

}
