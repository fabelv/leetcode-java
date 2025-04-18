package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            double sum = 0;

            for (int j = i; j < (k+i); j++) {
                sum += nums[j];
            }

            maxAverage = Math.max((sum/k), maxAverage);
        }

        return maxAverage;
    }

    // avoid recalculating the whole sum
    public static double findMaxAverage2(int[] nums, int k) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}
