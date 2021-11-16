package Javarush.Arrays.Arrays;
import java.util.Arrays;

/*
Массив значений
Implement such filling in the fillArray method (array Integer [], int value).
The method accepts an array and the value that needs to be filled in as arguments.
The array is filled completely, regardless of its length.
*/

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
/*

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }
}
*/