package com.huangxi.leetcode.double_pointer;

import com.alibaba.fastjson.JSON;

// 题目描述：在有序数组中找出两个数，使它们的和为 target。
//
// 使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
//
// 如果两个指针指向元素的和 sum == target，那么得到要求的结果；
// 如果 sum > target，移动较大的元素，使 sum 变小一些；
// 如果 sum < target，移动较小的元素，使 sum 变大一些。
// 数组中的元素最多遍历一次，时间复杂度为 O(N)。只使用了两个额外变量，空间复杂度为 O(1)。

/**
 * 167. Two Sum II - Input array is sorted (Easy)
 *
 * Input: numbers={2, 7, 11, 15}, target=9 Output:
 * index1=1, index2=2
 */
public class LeetCode167 {

  /**
   * 线上测试结果：
   * 解答成功:
   * 执行耗时:1 ms,击败了96.38% 的Java用户
   * 内存消耗:40.2 MB,击败了28.22% 的Java用户
   * @param numbers
   * @param target
   * @return
   */
  public static int[] twoSum(int[] numbers, int target) {
    if (numbers == null) return null;
    int i = 0, j = numbers.length - 1;
    while (i < j) {
      int sum = numbers[i] + numbers[j];
      if (sum == target) {
        return new int[]{i + 1, j + 1};
      } else if (sum < target) {
        i++;
      } else {
        j--;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    long nanoStart = System.nanoTime();

    int[] numbers = new int[]{2, 7, 11, 15};
    int target=9;
    int[] twoSum = twoSum(numbers, target);

    long costTime = System.currentTimeMillis() - start;
    long costTimeNano = System.nanoTime() - nanoStart;
    if(costTime>0){
      System.out.println("costTime="+costTime+" ms");
    }else {
      System.out.println("costTime="+costTimeNano+" ns");
    }

    System.out.println(JSON.toJSONString(twoSum));
  }
}
