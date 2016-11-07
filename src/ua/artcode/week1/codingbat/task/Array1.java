package ua.artcode.week1.codingbat.task;

/**
 * Created by serhii on 11/6/16.
 */
public class Array1 {


    public static int sum2(int[] nums) {
        // ternary condition ? <ret if true> : <ret if false>

        int res = nums.length > 1 ?
                nums[0] + nums[1] :
                nums.length == 1 ? nums[0] : 0;

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        return nums[0] + nums[1];
    }



}
