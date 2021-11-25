package EpamTask;
/*Consider a snail travels up a tree `a` feet each day. Then snail slides down `b` feet each night. Height of the tree is `h` feet.

Please, proceed to [Snail](/src/main/java/com/epam/rd/autotasks/snail/Snail.java) class
and write a program that prints number of days for the snail to reach the top of the tree.

Program reads `a`, `b`, `h` line by line. Input values are guaranteed to be positive integers.

If the snail cannot reach the top of the tree, print the message `Impossible`. */
import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        // int a, b, h;
        int h,a,b,shag,h0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        int days = 0;
        if((h<=0)||(a==b && h>a)||(h>a&& b>a)) {
            System.out.println("Impossible");
        } else {
            for (int i = 0; ; i -= b) {
                i += a;
                days++;
                if (i >= h) {
                    System.out.println(days);
                    break;
                }
            }
        }


    }
}