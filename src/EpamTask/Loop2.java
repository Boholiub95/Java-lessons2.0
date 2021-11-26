package EpamTask;
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "0";
        int suma= 0, midlle= 0, number = 0;
        int count = 0;

        while (input.equals( "0" )!=true)
        {
            number = Integer.parseInt(input);
            suma = suma+number;
            input = scanner.nextLine();
            count++;
        }
        midlle = (suma/--count);
        System.out.println(Math.round(midlle));

    }}

