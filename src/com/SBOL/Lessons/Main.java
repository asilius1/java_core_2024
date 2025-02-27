package com.SBOL.Lessons;
import com.SBOL.Lessons.Lesson_3.Task_1;
import com.SBOL.Lessons.Lesson_4.Task_2;

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
            System.out.println("0. Выход");

            i = readInput();

            switch (i) {
                case 1:
                    Task_1.menu();
                    break;
                case 2:
                    Task_2.menu();;
                    break;
                case 3:
                    System.out.println("Задание 3");
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