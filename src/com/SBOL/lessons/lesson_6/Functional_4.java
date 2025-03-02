package com.SBOL.lessons.lesson_6;

import java.lang.reflect.Array;

import static com.SBOL.lessons.Main.readInput;
import static com.SBOL.lessons.Main.readInputDouble;

public class Functional_4 {
    public static void task1() {
        // Вызываем метод для создания и заполнения массива
        int[] myArray = createAndFillArray();

        // Выводим массив на экран
        printArray(myArray);

        // Замена каждого элемента с нечетным индексом на ноль
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                myArray[i] = 0;
            }
        }

        System.out.println("Полученный массив после замены:");
        // Выводим получившийся массив с помощью цикла foreach
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }

    public static void task2() {


    }

    public static void task3() {

    }

    public static void task4() {


    }

    // Метод для создания и заполнения массива
    public static int[] createAndFillArray()  {

        System.out.print("Введите размер массива: ");
        int size = readInput();

        // Создаем массив указанного размера
        int[] array = new int[size];

        // Заполняем массив числами, вводимыми с клавиатуры
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите число №%d: ", i + 1);
            array[i] = readInput(); // Считываем целое число
        }
        return array; // Возвращаем созданный и заполненный массив
    }

    public static void printArray(int[] array) {
        System.out.println("\nЗаполненный массив: ");
        // Выводим заполненный массив с помощью цикла foreach
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}


