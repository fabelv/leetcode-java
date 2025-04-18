package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    @Test
    void sortedSquares() {
        int[] nums = {-4,-1,0,3,10};

        int[] res = SquaresOfASortedArray.sortedSquares(nums);

        // assertion
        assertArrayEquals(new int[]{0,1,9,16,100}, res);
    }

    @Test
    void sortedSquares1() {
        int[] nums = {-4,-1,0,3,10};

        int[] res = SquaresOfASortedArray.sortedSquares1(nums);

        // assertion
        assertArrayEquals(new int[]{0,1,9,16,100}, res);
    }

    @Test
    void sortedSquares2() {
        int[] nums = {-7,-3,2,3,11};

        int[] res = SquaresOfASortedArray.sortedSquares1(nums);

        // assertion
        assertArrayEquals(new int[]{4,9,9,49,121}, res);
    }

    @Test
    void sortedSquares3() {
        int[] nums = {-5,-3,-2,-1};

        int[] res = SquaresOfASortedArray.sortedSquares1(nums);

        // assertion
        assertArrayEquals(new int[]{1,4,9,25}, res);
    }
}