package EpamTask;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfPieces = scanner.nextInt();
        int numberOfPizzas;
        int n;
        if (numberOfPieces % numberOfPeople !=0){
            for ( n = 1; numberOfPieces % numberOfPeople !=0; n++ ){
                numberOfPieces = n + numberOfPieces;
            }
            System.out.println(numberOfPieces/numberOfPeople);
        } else {
            numberOfPizzas=(numberOfPieces) / numberOfPeople;
            System.out.println(numberOfPizzas);

        }

    }
}
