package EpamTask;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        String clock = String.format(
                "%1$d:%2$02d:%3$02d",
                seconds % 86400 / 3600,
                seconds % 86400 % 3600 / 60,
                seconds % 86400 % 3600 % 60

        );
        System.out.println(clock);

}}