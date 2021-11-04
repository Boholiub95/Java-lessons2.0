package Javarush;
/* Для решения этой задачи нужно:

Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.*/

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        if (radius > 0) {
            double pi = 3.14;
            int square = (int) (pi * radius * radius);

            System.out.println(square);
        }
    }
}
