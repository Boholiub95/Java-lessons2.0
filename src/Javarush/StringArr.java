package Javarush;

import java.util.Scanner;

public class StringArr {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
