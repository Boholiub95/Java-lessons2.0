package Javarush.Arrays.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }

}
/*
*
public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Ринго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвёрка, которой предстоит покорить космос:");
        System.out.println("Штурман: " + navigator);
        System.out.println("Пилот: " + pilot);
        System.out.println("Второй пилот: " + secondPilot);
        System.out.println("Бортинженер: " + flightEngineer);
    }
}
*/

