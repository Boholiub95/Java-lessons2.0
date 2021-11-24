package EpamTask;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/* Please, proceed to [HelloStrangers](src/main/java/com/epam/rd/autotasks/meetstrangers/HelloStrangers.java) class
and write a program that:
- asks for a number - amount of strangers to meet,
- then reads stranger names line by line
- and, finally, prints line by line "Hello, _stranger name_" for each stranger.

It is guaranteed that the input is not null.
It is guaranteed that the input of strangers count is int number.

Consider special cases:
- If strangers count is zero, then program must print "Oh, it looks like there is no one here".
- If strangers count is negative, then program must print "Seriously? Why so negative?".*/
public class HelloStrangers {
    public static void main(String[] args) throws IOException {


        Scanner inputAmount = new Scanner(System.in);
        String amountOfPeople = inputAmount.nextLine();
        int parsedAmountOfPeople = Integer.parseInt(amountOfPeople);

        if (parsedAmountOfPeople == 0) {
            System.out.println("Oh, it looks like there is no one here");
            return;
        }


        if (parsedAmountOfPeople < 0) {
            System.out.println("Seriously? Why so negative?");
            return;
        }

        String[] names = new String[parsedAmountOfPeople];


        for (int i = 0; i < parsedAmountOfPeople; i++) {

            names[i] = inputAmount.nextLine();
        }

        for (int i = 0; i < names.length; i++) {

            System.out.println("Hello, " + names[i]);

        }
    }
}