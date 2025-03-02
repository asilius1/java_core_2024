package com.SBOL.lessons.lesson_5;

import static com.SBOL.lessons.Main.readInput;
import static com.SBOL.lessons.Main.readInputDouble;

public class Functional_3 {
    public static void task1() {
        for(int i=1;i<=100;i++){
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2() {

        int x,y;

        do {
            System.out.print("Введите первое положительное число: ");
            x = readInput();

            if (x <= 0) {
                System.out.println("Число должно быть положительным! Попробуйте снова.");
            }
        } while (x <= 0);

        do {
            System.out.print("Введите второе положительное число: ");
            y = readInput();

            if (y <= 0) {
                System.out.println("Число должно быть положительным! Попробуйте снова.");
            }
        } while (y <= 0);

        if(x>y){
            int temp = x;
            x = y;
            y = temp;
        }

        int sum = 0;
        int currentNumber = x;
        while (currentNumber <= y) {
            sum += currentNumber;
            currentNumber++;
        }

        // Вывод результата
        System.out.println("Сумма всех чисел от " + x + " до " + y + " равна " + sum);
    }

    public static void task3() {
        int x;
        do {
            System.out.print("Введите число, которое не заканчивается на 0: ");
            x = readInput();

            if (x % 10 == 0) {
                System.out.println("Число должно быть положительным! Попробуйте снова.");
            }
        } while (x % 10 == 0);

        // Преобразуем число в строку, чтобы перевернуть его с помощью метода reverse(), который доступен через объект класса StringBuilder.
        String reversedNumber = new StringBuilder(Integer.toString(x)).reverse().toString();

        System.out.println("Число в обратном порядке: " + reversedNumber);
        }

    public static void task4() {
           int x;
           do {
               System.out.print("Введите число, которое не заканчивается на 0: ");
               x = readInput();

               if (x % 10 == 0) {
                   System.out.println("Число должно быть положительным! Попробуйте снова.");
               }
           } while (x % 10 == 0);

           int temp = x; //создаем временную переменную temp, которая содержит исходное число. Цикл продолжается до тех пор, пока значение temp больше нуля.
           while (temp > 0) {
               int digit = temp % 10; // Получаем последнюю цифру

               if (digit % 2 == 0) { // Если цифра четная
                   System.out.println(digit + " (четная)");
               } else { // Если цифра нечетная
                   System.out.println(digit + " (нечетная)");
               }

               temp /= 10; // Убираем последнюю цифру
           }
    }
}
