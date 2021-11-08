package Javarush;

import java.util.Scanner;

/*
Удаляем одинаковые строки
Read 6 lines and fill the strings array with them.
Remove duplicate strings from the strings array, replacing them with null (null must not be "null" strings).
*/

    public class Solution6 {
        public static String[] strings;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            strings = new String[6];
            for (int i = 0; i < 6; i++) {
                strings[i] = scanner.nextLine();
            }

            for (int i = 0; i < strings.length; i++) {
                String currentString = strings[i];
                for (int j = i + 1; j < strings.length; j++) {
                    if (currentString == null) {
                        break;
                    }
                    if (currentString.equals(strings[j])) {
                        strings[j] = null;
                        strings[i] = null;
                    }
                }
            }
            for (int i = 0; i < strings.length; i++) {
                System.out.print(strings[i] + ", ");
            }
        }
    }
