package Javarush.Arrays.Arrays;

import java.util.Scanner;

/*
Минимальный элемент массива
Read 10 numbers from the console and fill the array with them using the getArrayOfTenElements () method.
Find the minimum element of an array and return that element using the min (int []) method.
In the min (int []) method, be sure to use the Math.min (int, int) method.
*/

public class Task3 {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

