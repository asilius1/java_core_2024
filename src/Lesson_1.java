import java.util.Scanner;

public class Lesson_1 {

    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Введите число a:");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }


        sc.close();}
}
