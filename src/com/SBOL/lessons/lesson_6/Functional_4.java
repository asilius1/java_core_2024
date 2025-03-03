package com.SBOL.lessons.lesson_6;

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
        printArray(myArray);
    }

    public static void task2() {
        // Вызываем метод для создания и заполнения массива
        int[] firstArray = createAndFillArray();

        int[] secondArray = new int[firstArray.length + 1];

        // Копируем значения из первого массива во второй
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

        // Устанавливаем последний элемент второго массива в 0
        secondArray[secondArray.length - 1] = 0;

        printArray(secondArray);

    }

    public static void task3() {

        // Вызываем метод для создания и заполнения массива
        int[] firstArray = createAndFillArray();

        // Находим максимальный и минимальный элементы
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < firstArray.length; i++) {
            if (firstArray[i] > firstArray[maxIndex]) {
                maxIndex = i;
            }
            if (firstArray[i] < firstArray[minIndex]) {
                minIndex = i;
            }
        }

        // Заменяем максимальный и минимальный элементы
        firstArray[maxIndex] = 1000;
        firstArray[minIndex] = -1000;

        printArray(firstArray);
    }

    public static void task4() {

        int[] myArray = createAndFillArray();

        for(int i = 0; i < myArray.length - 1; i++) {
            for(int j = 0; j < myArray.length - i - 1; j++) {
                if(myArray[j] > myArray[j + 1]) {
                    // Меняем элементы местами
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

        printArray(myArray);
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


