package com.SBOL.Lessons.Lesson_3;

import static com.SBOL.Lessons.Main.readInput;


public class Functional {

    public static void task1() {
        int x;
        x = (98-25)*6;
        System.out.println("Ответ на уравнение x/6+25=98 равен " + x + "\n");


    }

    public static void task2() {
        int x=8, y=9, z=12;
        x += 5; // эквивалентно x = x + 5;
        y *= 9; // эквивалентно y = y * 9;
        z -= 6; // эквивалентно z = z - 6;
        System.out.println("Результат задания 2 \n x=" + x +"\n y= "+ y + "\n z= " + z);
    }

    public static void task3() {
        int a=35, b=65;
        int c = (a > b) ? 5 : 10;
        System.out.println("Результат задания 3 \n c=" + c);
    }

    public static void task4() {
        int x=5, y=2;
        //x++;  Увеличение x до 6
        //y--;  Уменьшение y до 1
        int c = (++x) * (y--) ; // Вычисление произведения
        System.out.println("Результат задания 4 \n");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c);
    }
}
