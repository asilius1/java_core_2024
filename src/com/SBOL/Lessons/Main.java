package com.SBOL.Lessons;
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
                    System.out.println("Задание 1");
                    break;
                case 2:
                    System.out.println("Задание 2");
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
}