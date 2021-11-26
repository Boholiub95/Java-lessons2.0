package EpamTask;

import java.util.Scanner;
public class Task12
{
    static Scanner input = new Scanner (System.in);
    public static void main (String[] args)
    {
        double i;
        double sum = 0;
        int count = 0;
        while(input.hasNextDouble())
        {
            i = input.nextDouble();
            sum = sum + i;
            count++;
        }
        System.out.println( sum  + (count));
        System.out.println( sum / (count));
    }
}
