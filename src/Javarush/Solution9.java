package Javarush;

import java.util.Scanner;

/*
Создаем двумерный массив
Reads from the console the number N - the number of lines in the array (consider that this number will be greater than 0, you can skip checking).
Reads N numbers from the console (you don't have to check any numbers that are greater than 0).
Initializes a two-dimensional multiArray:
*/

public class Solution9 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
}