package EpamTask;
/*Please, proceed to the class MeetAStranger.
The program must read a string from System.in and print a message "Hello, input".
Note that when entering an input string consisting of several words, the entire input must be printed. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>"
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Hello," + input);
    }
}
