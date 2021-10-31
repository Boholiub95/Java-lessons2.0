package Javarush;
/* В этой задаче нужно:

Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько. */

import java.util.Scanner;

public class Task9 { public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    int min = console.nextInt();
    int secondMin = console.nextInt();
    if (secondMin < min) {
        int tmp = min;
        min = secondMin;
        secondMin = tmp;
    }
    while (console.hasNextInt()) {
        int x = console.nextInt();
        if(min == secondMin) {
            if(x < min) {
                min = x;
            } else {
                secondMin = x;
            }
        } else if (x < min) {
            secondMin = min;
            min = x;
        } else if (x > min && x < secondMin) {
            secondMin = x;
        }
    }
    System.out.println(secondMin);
}
}

