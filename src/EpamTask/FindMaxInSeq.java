package EpamTask;

/*write a program that reads a sequence of integer values from standard output and finds the maximum value. You must
place your solution into the `max`  method to pass tests.

Details:

- You must read sequence values until the next one is `0`. Zero value means end of the input sequence.
- The sequence is guaranteed to contain at least one value. */

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        Scanner scanner= new Scanner(System.in);

        double max = Integer.MIN_VALUE;
        while(true){
            int n = scanner.nextInt();
            if(n==0){
                break;
            }
            if(n>max){
                max=n;
            }

        }
        return (int)max;

    }

    public static void main(String[] args) {

        System.out.println(FindMaxInSeq.max());
    }
}