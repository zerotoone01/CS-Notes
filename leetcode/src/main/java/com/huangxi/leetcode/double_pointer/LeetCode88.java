package com.huangxi.leetcode.double_pointer;

/**
 *
 * 88. Merge Sorted Array (Easy)
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * 归并两个有序数组
 *  题目描述：把归并结果存到第一个数组上。
 *  需要从尾开始遍历，否则在 nums1 上归并得到的值会覆盖还未进行归并比较的值。
 *
 */
public class LeetCode88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1= {1,2,3,0,0,0};
        int[] nums2= {2,5,6};
        int m = 3;
        int n = nums2.length;
        merge(nums1,m,nums2,n);
        System.out.println(nums1);

    }
}
