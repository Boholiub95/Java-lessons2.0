package Javarush.Arrays.Arrays;
/* implement the printNumbers () method that prints numbers from 1 to 10, inclusive, with a pause between printing each number - 1.3 milliseconds. The sleep (long, int) method of the Thread class will help you with this.*/
public class Task4 {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300_000);
            }
        }
    }
}


