package Javarush.Arrays.Arrays;
/* In the  class, the countDown () method counts down. You need to make sure that there is a 1 second pause between text output to the console. The sleep (long) method of the Thread class will help you with this. */
public class Task12 {


    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Старт!");
    }
}

