package Javarush.Arrays.Arrays;
/*
The printSqrt (int [] array) method should print the square root for each element of the passed array.
But this does not happen due to the conflict of variable names. Correct the variable names so that the code compiles.
As a result of the work, the program should display the corresponding line in the console for each element of the array.*/
public class Task {



        public static void main(String[] args) {
            int[] array = {15,64,9,51,42};
            printSqrt(array);
        }

        public static void printSqrt(int[] array) {
            String elementSqrtString = "Корень квадратный для числа ";
            for (int i = 0; i < array.length; i++) {
                int element = array[i];
                double elementSqrt = Math.sqrt(element);
                System.out.println(elementSqrtString + element + " равен " + elementSqrt);

        }
    }
}
