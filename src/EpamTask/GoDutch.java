package EpamTask;
/*write a program that reads a bill total amount and a number of friends, and then prints part to pay.

Consider some details:
- Program must read data from System.in
- Bill total amount cannot be negative. If input value is negative, the program stops, printing: `Bill total amount cannot be negative`
- Number of friends cannot be negative or zero. If input value is, then the program stops, printing: `Number of friends cannot be negative or zero`
- Bill total amount, number of friends and part to pay are integers
 */
import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int friends = scanner.nextInt();
        int chay;
        if (sum<0){
            System.out.println("Bill total amount cannot be negative");
        }else if (friends <=0){
            System.out.println("Number of friends cannot be negative or zero");
        }else {
            chay = (int)Math.ceil(sum/100*10);
            int a1=(int)Math.ceil(sum/friends);
            int a2=(chay/friends);
            System.out.println(/*(sum/friends)+(chay/friends)*/a1+a2);
        }
    }
}

