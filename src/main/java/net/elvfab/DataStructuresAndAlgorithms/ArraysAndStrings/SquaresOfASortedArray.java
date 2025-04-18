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
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftVal = nums[left];
            int rightVal = nums[right];

            if (Math.abs(leftVal) > Math.abs(rightVal)) {
                result[pos] = leftVal * leftVal;
                left++;
            } else {
                result[pos] = rightVal * rightVal;
                right--;
            }

            pos--;
        }

        return result;
    }
}
