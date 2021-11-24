package EpamTask;

import java.io.IOException;
import java.util.Scanner;

public class Task6 { public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String strangersName = scanner.nextLine();
        int parseInt = Integer.parseInt(strangersName);
        if ( parseInt == 0)  {
                System.out.println("Oh, it looks like there is no one here");}
        if  ( parseInt < 0 ){
                System.out.println("Seriously? Why so negative?");}
        for (int i = 0; i < strangersName.length(); i++) {
                strangersName = scanner.nextLine();
                System.out.println("Hello, " + strangersName);
        }
}}