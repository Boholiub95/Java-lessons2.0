
import java.util.*;
import static java.util.Collections.*;

/**
 * Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:
 *
 *
 */

public class Task1 {
    private static List<Integer> divider(int divider, Integer[] array) {
        List<Integer> divided = new LinkedList<Integer>();
        for (Integer anArray : array) {
            if (anArray % divider == 0)
                divided.add(anArray);
        }
        return divided;
    }

    private static Map revSortByVal(Map<Integer, Integer> map) {
        List<Object> list = new LinkedList<Object>(map.entrySet());
        sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });
        Map result = new LinkedHashMap();
        for (Object aList : list) {
            Map.Entry entry = (Map.Entry) aList;
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    private static List<Integer> bubbleRevSortByMod(Integer[] input) {
        Integer[] nums = input.clone();
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < nums.length - j; i++) {
                if (Math.abs(nums[i]) < Math.abs(nums[i + 1])) {
                    tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return Arrays.asList(nums);
    }

    private static long gcd(long a, long b) // Greatest Common Divisor
    {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long gcd(Integer[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++)
            result = gcd(result, input[i]);
        return result;
    }

    private static long lcm(long a, long b) // Least Common Multiple
    {
        return a * (b / gcd(a, b));
    }

    private static long lcm(Integer[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++) {
            if ((input[i] == 0 || input[0] == 0)
                    || (input[i] < 0 || input[0] < 0))
                break;
            result = lcm(result, input[i]);
        }
        return result;
    }

    private static List<Integer> list1 = new LinkedList<Integer>();
    private static List<Integer> list2 = new LinkedList<Integer>();

    public static List<Integer> primeNums(Integer[] input) {
        list1.clear();
        for (Integer anInput : input) {
            if (isPrimeNum(anInput)) {
                list1.add(anInput);
            }
        }
        return list1;
    }

    public static boolean isPrimeNum(int n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return (n % 2 != 0 && prime && n > 2) || n == 2;
    }

    private static Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    private static Map<Integer, Integer> invMap = new TreeMap<Integer, Integer>();

    private static void put(Integer key, Integer value) {
        map.put(key, value);
        invMap.put(value, key);
    }

    private static void buildPascalTriangle(int number, int rows) {
        for (int y = 0; y < rows; y++) {
            int c = number;
            for (int w = 0; w < rows - y; w++) {
                System.out.print("   ");
            }
            for (int x = 0; x <= y; x++) {
                System.out.print("   " + c + " ");
                c = c * (y - x) / (x + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] numbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++)
            numbers[i] = in.nextInt();

        // 1. Четные и нечетные числа
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0)
                list1.add(numbers[i]);
            else
                list2.add(numbers[i]);
        }
        System.out.println("Чётные числа: " + list1);
        System.out.println("Нечётные числа: " + list2);

        // 2. Наибольшее и наименьшее число.
        List<Integer> listFromArray = Arrays.asList(numbers);
        System.out.println("Наибольшее число: " + max(listFromArray));
        System.out.println("Наименьшее число: " + min(listFromArray));

        // 3. Числа, которые делятся на 3 или на 9.
        System.out.println("Числа, которые делятся на 3: "
                + divider(3, numbers));
        System.out.println("Числа, которые делятся на 9: "
                + divider(9, numbers));

        // 4. Числа, которые делятся на 5 и на 7.
        System.out.println("Числа, которые делятся на 5: "
                + divider(5, numbers));
        System.out.println("Числа, которые делятся на 7: "
                + divider(7, numbers));

        // 5. Элементы, расположенные методом пузырька по убыванию модулей. //
        System.out.println("Элементы, расположенные методом пузырька "
                + "по убыванию модулей: " + bubbleRevSortByMod(numbers));

        // 6. Все трехзначные числа, в десятичной записи которых нет одинаковых
        // цифр.
        String num;
        list1.clear();
        for (int i = 0; i < size; i++) {
            num = numbers[i].toString();
            if (num.length() == 3 && num.charAt(0) != num.charAt(1)
                    && num.charAt(1) != num.charAt(2)
                    && num.charAt(0) != num.charAt(2))
                list1.add(numbers[i]);
        }
        System.out.println("Все трехзначные числа, "
                + "в десятичной записи которых нет одинаковых цифр: " + list1);

        // 7. Наибольший общий делитель и наименьшее общее кратное этих чисел.
        System.out.println("Наибольший общий делитель: " + gcd(numbers));
        System.out.println("Наименьшее общее кратное: " + lcm(numbers));

        // 8. Простые числа.
        System.out.println("Простые числа: " + primeNums(numbers));

        // 9. Отсортированные числа в порядке возрастания и убывания.
        list1.clear();
        list1.addAll(listFromArray);
        sort(list1);
        System.out.println("Отсортированные числа в порядке возрастания: "
                + list1);
        reverse(list1);
        System.out
                .println("Отсортированные числа в порядке убывания: " + list1);

        // 10. Числа в порядке убывания частоты встречаемости чисел.
        for (Integer i : numbers) {
            put(i, frequency(listFromArray, i));
        }
        System.out.println("Числа в порядке убывания частоты встречаемости "
                + "чисел <Число=Встречаемость>: " + revSortByVal(map));

        // 11. “Счастливые” числа.
        list1.clear();
        for (int i = 0; i < size; i++) {
            num = numbers[i].toString();
            if (num.length() == 4
                    && num.charAt(0) + num.charAt(1) == num.charAt(2)
                    + num.charAt(3))
                list1.add(numbers[i]);
        }
        System.out.println("“Счастливые” числа (Σ 1-ой пары чисел "
                + "= Σ 2-ой пары): " + list1);

        // 12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
        list1.clear();
        for (int i = 2; i < size - 2; i++) {
            if (numbers.length < 3)
                break;
            else if (numbers[i + 2] == numbers[i] + numbers[i + 1])
                list1.add(numbers[i]);
        }
        System.out.println("Числа Фибоначчи: " + list1);

        // 13. Числа-палиндромы, значения которых в прямом и обратном порядке
        // совпадают.
        List<StringBuilder> palindromes = new LinkedList<StringBuilder>();
        for (int i = 0; i < size; i++) {
            StringBuilder s = new StringBuilder(numbers[i].toString());
            if (s.toString().equals(s.reverse().toString()))
                palindromes.add(s);
        }
        System.out.println("Числа-палиндромы: " + palindromes);

        // 14. Элементы, которые равны полусумме соседних элементов.
        list1.clear();
        Integer[] int2;
        int2 = numbers.clone();
        for (int i = 1; i < int2.length - 1; i++) {
            if (int2.length < 3)
                break;
            if (int2[i] == (int2[i - 1] + int2[i + 1]) / 2)
                list1.add(int2[i]);
        }
        System.out.println("Элементы, которые равны полусумме соседних "
                + "элементов: " + list1);

        /**
         * 15. Период десятичной дроби p = m/n для первых двух целых
         * положительных чисел n и m, расположенных подряд.
         *
         * @author RodionGork
         */
        long p, q, r, l, t, i;
        for (int n = 0; n < size - 1; n++)
            if (numbers.length < 2)
                break;
            else if (numbers[n] >= 0 && numbers[n + 1] >= 0) {
                p = numbers[n];
                q = numbers[n + 1];
                r = p;
                for (i = 0; i < q; i++)
                    r = (r * 10) % q;
                t = r;
                l = 0;
                do {
                    r = (r * 10) % q;
                    l++;
                } while (r != t);
                t = r = p;
                System.out.print("Период десятичной дроби p = m/n для "
                        + "первых двух целых положительных чисел n и m, "
                        + "расположенных подряд: 0.");
                for (i = 0; i < l; i++)
                    r = (r * 10) % q;
                for (i = 0; r != t; i++) {
                    System.out.print(t * 10 / q);
                    r = (r * 10) % q;
                    t = (t * 10) % q;
                }
                System.out.print('(');
                for (i = 0; i < l; i++) {
                    System.out.print(t * 10 / q);
                    t = (t * 10) % q;
                }
                System.out.println(')' + " = " + p + "/" + q);
                break;
            }

        // 16. Построить треугольник Паскаля для первого положительного числа.
        list1.clear();
        for (int u = 0; u < size; u++)
            if (numbers[u] >= 0) {
                list1.add(numbers[u]);
                System.out
                        .print("Сколько строк треугольника Паскаля для числа "
                                + list1.get(0) + " отображать? ");
                int rows = in.nextInt();
                buildPascalTriangle(list1.get(0), rows);
            }
    }
}
