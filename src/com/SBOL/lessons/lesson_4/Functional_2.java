package com.SBOL.lessons.lesson_4;

import static com.SBOL.lessons.Main.readInput;
import static com.SBOL.lessons.Main.readInputDouble;

public class Functional_2 {
    public static void task1() {
        System.out.print("Введите первое число: ");
        int num1 = readInput();
        System.out.print("Введите второе число: ");
        int num2 = readInput();
        System.out.print("Введите третье число: ");
        int num3 = readInput();

        // Проверяем каждое число на четность и выводим четные
        if (num1 % 2 == 0) {
            System.out.println(num1);
        }

        if (num2 % 2 == 0) {
            System.out.println(num2);
        }

        if (num3 % 2 == 0) {
            System.out.println(num3);
        }

    }

    public static void task2() {
        System.out.print("Введите первое число: ");
        int num1 = readInput();
        System.out.print("Введите второе число: ");
        int num2 = readInput();
        System.out.print("Введите третье число: ");
        int num3 = readInput();

        if (num1 % 2 == 0 || num1 % 5 == 0) {
            System.out.println(num1);
        }

        if (num2 % 2 == 0 || num2 % 5 == 0) {
            System.out.println(num2);
        }

        if (num3 % 2 == 0 || num3 % 5 == 0) {
            System.out.println(num3);
        }
    }

    public static void task3() {
        System.out.print("Введите число x: ");
        double x = readInputDouble();

        // Выполняем деление 15 на x
        double result = 15 / x;

        switch ((int) result) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.printf("Результат деления равен %.5f\n", result);
                break;
        }
    }
}

