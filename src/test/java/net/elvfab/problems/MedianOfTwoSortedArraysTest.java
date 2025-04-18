package net.elvfab.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        double res = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        // assertion
        assertEquals(2.0, res);
    }

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        double res = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        // assertion
        assertEquals(2.5, res);
    }

    @Test
    void findMedianSortedArrays3() {
        int[] nums1 = {1};
        int[] nums2 = {};

        double res = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        // assertion
        assertEquals(1.0, res);
    }

    @Test
    void findMedianSortedArrays4() {
        int[] nums1 = {2,2,4,4};
        int[] nums2 = {2,2,2,4,4};

        double res = MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        // assertion
        assertEquals(2.0, res);
    }
}