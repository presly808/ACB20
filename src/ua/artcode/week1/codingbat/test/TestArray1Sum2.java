package ua.artcode.week1.codingbat.test;

import ua.artcode.week1.codingbat.task.Array1;

import java.util.Arrays;

public class TestArray1Sum2 {
    // psvm
    public static void main(String[] args) {

        /*sum2([1, 2, 3]) → 3	3	OK
        sum2([1, 1]) → 2	2	OK
        sum2([1, 1, 1, 1]) → 2	2	OK
        sum2([1, 2]) → 3	3	OK
        sum2([1]) → 1	1	OK
        sum2([]) → 0	0	OK
        sum2([4, 5, 6]) → 9	9	OK
        sum2([4]) → 4	4	OK
        other tests
        OK
        */

        int[] in1 = {1,2,3};
        int expected1 = 3;

        int actual = Array1.sum2(in1);

        String in1Str = Arrays.toString(in1);

        String result = String.format("Array1.sum2(%s) -> expected: %d, actual: %d",
                in1Str, expected1, actual);

        System.out.println(result);
    }
}
