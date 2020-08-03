package com.huangxi.leetcode.double_pointer;

/**
 * 633. Sum of Square Numbers (Easy)
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 */
public class LeetCode633 {

 public static boolean judgeSquareNum(int target){
  if(target<=0){
   return false;
  }
  // target >1 ，平方值肯定比在二分值之内，不可能大于二分值
  int i = target >> 1;
  //TODO 构建一个小于 i 的数组，然后开始用双指针判断


  return false;
 }
  public static void main(String[] args) {
   //
  }
 }
