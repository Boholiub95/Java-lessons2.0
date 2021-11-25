package Javarush.Arrays.Arrays;

import java.util.concurrent.TimeUnit;

/*
Таймер
implement the setTimer (int, int, int, int, int) method that sleeps for a specific time using the appropriate java.util.concurrent.TimeUnit methods
*/

public class Solution8 {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}