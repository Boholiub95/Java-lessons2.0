package EpamTask;

import java.util.Scanner;
import java.time.LocalTime;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int I = seconds / 3600;
        seconds %= 3600;
        while (I > 24) I -= 24;
        System.out.printf("%tH:%02d:%02d", I, seconds / 60, seconds% 60);
    }
}
