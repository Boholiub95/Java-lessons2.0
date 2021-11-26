package EpamTask;

/* Please, proceed to the [SumOfEvenNumbers] class and
implement the `sum` method.

The correct implementation should receive an array of `int` values and return the sum of even numbers.

Details:

- If given array is null or empty, method returns 0.
- `sum` method must not modify the array.
- Input array may contain any `int` value between `Integer.MIN_VALUE` and `Integer.MAX_VALUE`.*/
public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[]vals = new int[]{-2,10,0,5};
        int result = SumOfEvenNumbers.sum(vals);
        System.out.println(result == 8);

    }


    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                sum = sum + array[i];
            }
        }
        if ((array == null)||(array.length==0)) {
            return 0 ;
        }
        return sum;
    }}
