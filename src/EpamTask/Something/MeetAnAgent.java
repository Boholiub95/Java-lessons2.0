package EpamTask.Something;
/*Meet an Agent
The purpose of this exercise is to familiarize you with simple conditional statements.

Estimated workload of this exercise is 20 min.

Description
Please, proceed to MeetAnAgent class and write a program that:

asks for an input number,
if the input equals to the secret password number, prints "Hello, Agent",
otherwise, prints "Access denied".
Secret password is stored in final static int password. */
import java.util.Scanner;

public class MeetAnAgent {
    final static int password = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input == password){
            System.out.println("Hello, Agent");
        }else {
            System.out.println("Access denied");
        }

    }
}
