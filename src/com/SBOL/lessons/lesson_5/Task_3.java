package com.SBOL.lessons.lesson_5;

import static com.SBOL.lessons.Main.readInput;

public class Task_3 {
    public static void menu() {
        int c;

        do {
            System.out.println("\n Выберите необходимое действие в задании:  \n");
            System.out.println("1 - Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)\n");
            System.out.println("2 - Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел \n"+
                    "от одного числа до другого. (Используйте цикл while).\n");
            System.out.println("3 - Ввести число с консоли, которое не заканчивается на 0. Вывести число в обратном порядке.\n"+
                    "Использовать оператор %. (цикл while,наподобие задачи, которую разбирали в конце занятия)\n");
            System.out.println("4 - Ввести число с консоли, которое не заканчивается на 0.\n" +
                    "Вывести чётные и нечётные числа через while and if. Использовать оператор %.\n");
            c = readInput();

            switch (c) {
                case 1:
                    Functional_3.task1();
                    break;
                case 2:
                    Functional_3.task2();
                    break;
                case 3:
                    Functional_3.task3();
                    break;
                case 4:
                    Functional_3.task4();
                    break;
                case 0:
                    break;
            }
        }
        while (c != 0);
    }
}
