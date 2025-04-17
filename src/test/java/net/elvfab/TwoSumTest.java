package net.elvfab;

import net.elvfab.problems.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
class TwoSumTest {

    @Test
    void twoSumExample() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);

        // assertion
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSumExample2() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum2(nums, target);

        // assertion
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSumExample3() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum3(nums, target);

        // assertion
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void compareImplementationsPerformance() {
        int[] nums = IntStream.range(0, 10_000_000).toArray();
        int target = nums[0] + nums[nums.length - 1];

        long t1 = System.nanoTime();
        TwoSum.twoSum(nums, target);
        long t2 = System.nanoTime();
        System.out.println("twoSum:   " + (t2 - t1) + " ns");

        long t3 = System.nanoTime();
        TwoSum.twoSum2(nums, target);
        long t4 = System.nanoTime();
        System.out.println("twoSum2:  " + (t4 - t3) + " ns");

        long t5 = System.nanoTime();
        TwoSum.twoSum3(nums, target);
        long t6 = System.nanoTime();
        System.out.println("twoSum3:  " + (t6 - t5) + " ns");
    }


}