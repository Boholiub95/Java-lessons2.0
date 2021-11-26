package EpamTask;
/*
* Write a program that reads a sequence of integer values from standard input and finds the average value.

Details:

- You must read sequence values until the next one is `0`. Zero value means end of the input sequence.
- The sequence is guaranteed to contain at least one value.
- Average value is also an **integer**. Use **integer** operations.*/

import java.util.Scanner;
public class Average {
    public static void main(String[] args0) {
        Scanner scan = new Scanner(System.in);

        int value = -1, sum = 0, count = 0;
        while((value = scan.nextInt()) != 0)
        {
            count++;
            sum = sum + value;

        }
        System.out.println(Math.round (sum / count) );
    }}