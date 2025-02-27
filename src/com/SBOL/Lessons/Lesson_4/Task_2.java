package com.SBOL.Lessons.Lesson_4;

import static com.SBOL.Lessons.Main.readInput;

public class Task_2 {
    public static void menu() {
        int c;

        do {
            System.out.println("\n Выберите необходимое действие в задании:  \n");
            System.out.println("1 -  На вход даны 3 числа. Вывести в консоль только четные числа\n");
            System.out.println("2 - На вход даны 3 числа. Вывести в консоль только те числа,\n" +
                    "которые делятся на 2 или на 5 (используйте оператор % для проверки деления без остатка)\n");
            System.out.println("3 - Дано 15/x=result, где x-число, которое вводится с\n" +
                    "командной строки, result-результат вычисления. Написать программу, которая будет выводит разный \n" +
                    "текст, в зависимости от значения result. В случае result=3, вывести: \"Результат деления равен 3\" \n"+
                    "В случае result=5вывести: \"Результат деления равен 5\" В других случаях вывести:\n" +
                    "\"Результат деления равен дробному числу\". При этом в последнем случае вывести точный результат \n"+
                    "деления (использовать приведение типов) Для выполнения задания использовать оператор switch- case.\n");
            c = readInput();

            switch (c) {
                case 1:
                    Functional_2.task1();
                    break;
                case 2:
                    Functional_2.task2();
                    break;
                case 3:
                    Functional_2.task3();
                    break;
                case 0:
                    break;
            }
        }
        while (c != 0);
    }
}