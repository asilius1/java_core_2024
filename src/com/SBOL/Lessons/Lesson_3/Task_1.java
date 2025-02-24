package com.SBOL.Lessons.Lesson_3;

import static com.SBOL.Lessons.Main.readInput;

public class Task_1 {
    public static void menu() {
        int c, i;

        do {
            System.out.println("Выберите необходимое действие в задании:  ");
            System.out.println("1 - Дано уравнение x/6+25=98. \n Найти x и вывести его в консоль\n");
            System.out.println("2 - x=x+5; y=y*9; z=z-6; \n Необходимо укоротить данные выражения, чтобы результат не " +
                    "изменился. x=8; y=9; z=12; (операции присваивания, нужно просто написать по-другому)\n");
            System.out.println("3 - Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5 иначе, присвоить " +
                    "числу c значение 10. (тернарный оператор)\n");
            System.out.println("4 - Даны значения: x=5; y=2; c=x*y;\n" +
                    " Расставьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с " +
                    "равнялось 12, x=равнялось 6, y=1Выведите полученные значения в консоль. \n");
            System.out.println("0 - выход");
            c = readInput();

            switch (c) {
                case 1:
                    Functional.task1();
                    break;
                case 2:
                    Functional.task2();
                    break;
                case 0:
                    break;
            }
        }
        while (c != 0);
    }

}
