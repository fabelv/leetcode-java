package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    @Test
    void findMaxAverage() {
        int k = 4;
        int[] nums = {1,12,-5,-6,50,3};

        double res = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        // assertion
        assertEquals(12.75, res);
    }

    @Test
    void findMaxAverage1() {
        int k = 1;
        int[] nums = {12};

        double res = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        // assertion
        assertEquals(12, res);
    }

    @Test
    void findMaxAverage2() {
        int k = 1;
        int[] nums = {-12};

        double res = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        // assertion
        assertEquals(-12, res);
    }

    @Test
    void findMaxAverage21() {
        int k = 4;
        int[] nums = {1,12,-5,-6,50,3};

        double res = MaximumAverageSubarrayI.findMaxAverage2(nums, k);

        // assertion
        assertEquals(12.75, res);
    }

    @Test
    void findMaxAverage22() {
        int k = 1;
        int[] nums = {12};

        double res = MaximumAverageSubarrayI.findMaxAverage2(nums, k);

        // assertion
        assertEquals(12, res);
    }

    @Test
    void findMaxAverage23() {
        int k = 1;
        int[] nums = {-12};

        double res = MaximumAverageSubarrayI.findMaxAverage2(nums, k);

        // assertion
        assertEquals(-12, res);
    }

}