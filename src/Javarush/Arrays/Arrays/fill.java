package Javarush.Arrays.Arrays;


import java.util.Arrays;

/*

Implement the static main (String []) method that populates array with valueStart and valueEnd.
If the length of the array is even, its first half must be filled with valueStart values, and the second with valueEnd. If the length of the array is odd, then fill the larger part with valueStart values, the smaller one - valueEnd. To fill the array, use the Arrays.fill (int [], int, int, int) method.
*/

public class fill {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
