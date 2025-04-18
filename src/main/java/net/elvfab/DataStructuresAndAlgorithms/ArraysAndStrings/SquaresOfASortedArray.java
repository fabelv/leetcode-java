package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import java.util.Arrays;

public class SquaresOfASortedArray {

    // O(2n) ?
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        return Arrays.stream(nums).sorted().toArray();
    }

    public static int[] sortedSquares1(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--){
            if (Math.abs(nums[0]) < Math.abs(nums[i])){
                nums[i] = (int) Math.pow(nums[i], 2);
            }else {
                // swap
                int tmp = nums[i];
                nums[i] = (int) Math.pow(nums[0], 2);
                nums[0] = tmp;
            }
        }

        nums[0] = (int) Math.pow(nums[0], 2);

        return nums;
    }
}
