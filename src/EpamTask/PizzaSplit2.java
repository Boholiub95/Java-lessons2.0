package EpamTask;

import java.util.Scanner;

/*The program must read two values from `System.in`:
- number of people;
- number of pieces per pizza.

It is guaranteed that this values are positive integers.

Then the program must print the minimum number of pizzas (not zero) so that everyone has an equal number of slices and no slice is left.*/
public class PizzaSplit2 {

    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner= new Scanner(System.in);
        int people=scanner.nextInt();
        int parts=scanner.nextInt();
        int i=1;
        int find;
        while(true){
            find=i*parts;
            if(find%people==0){
                break;
            }
            i++;
        }
        System.out.println(find/parts);

    }
}
