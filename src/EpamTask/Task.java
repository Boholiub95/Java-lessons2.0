package EpamTask;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int s = scanner.nextInt();
        int h = s / 3600;
        int m = (s - h * 3600) / 60;
        s = s - h * 3600 - m * 60;

            System.out.println( ((h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s)));
        }}
