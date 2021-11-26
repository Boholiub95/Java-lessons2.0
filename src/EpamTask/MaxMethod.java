package EpamTask;
/* Please, proceed to the [`MaxMethod`]
and implement the `max` method.

The correct implementation should receive an array of `int` values and return its maximum value.

Details:
- An input array is guaranteed to not be an empty array or `null`.
- `max` method must not modify the array.
- Input array may contain any `int` value between `Integer.MIN_VALUE` and `Integer.MAX_VALUE`. */
public class MaxMethod {
    public static int max(int[] values) {

        /*throw new UnsupportedOperationException();*/
        int maxInt = values[0];
        for (int i = 0; i< values.length; i++) {
            if(maxInt < values[i]){
                maxInt = values[i];
            }
        }
        return maxInt;
    }
}
