package EpamTask;


import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n",
                "Ведите значения h; a; b; через пробел",
                "Для выхода из программы <Ctrl> z, или <Ctrl> d, или, как у вашей OC");
        while (input.hasNext()) {
            try {
                printTimeMovement(input.nextDouble(), input.nextDouble(), input.nextDouble());

            }
            catch (NoSuchElementException exp) {
                System.err.println("Ошибка ввода! Попробуйте еще раз:");
                input.nextLine();
            }
            System.out.print("? ");
        }
    }

    public static void printTimeMovement(final double h, final double a, final double b) {
        if (h < 0) {
            System.out.println("Отрицательная длинна шеста!");
            return;
        }
        if (a <= b)
            System.out.println("Время движения бесконечно!");
        else {
            System.out.printf("Время движения = %.2f суток%n", h/(a - b));
        }
    }}

