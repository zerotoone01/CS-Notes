package com.huangxi.leetcode.double_pointer;

//题目描述：可以删除一个字符，判断是否能构成回文字符串。
//
//所谓的回文字符串，是指具有左右对称特点的字符串，例如 "abcba" 就是一个回文字符串。
//
//使用双指针可以很容易判断一个字符串是否是回文字符串：令一个指针从左到右遍历，一个指针从右到左遍历，这两个指针同时移动一个位置，每次都判断两个指针指向的字符是否相同，如果都相同，字符串才是具有左右对称性质的回文字符串。
//
//本题的关键是处理删除一个字符。在使用双指针遍历字符串时，如果出现两个指针指向的字符不相等的情况，我们就试着删除一个字符，再判断删除完之后的字符串是否是回文字符串。
//
//在判断是否为回文字符串时，我们不需要判断整个字符串，因为左指针左边和右指针右边的字符之前已经判断过具有对称性质，所以只需要判断中间的子字符串即可。
//
//在试着删除字符时，我们既可以删除左指针指向的字符，也可以删除右指针指向的字符。

import com.huangxi.util.TimerUtil;

import java.util.Map;

/**
 * 680. Valid Palindrome II (Easy)
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 *
 * 审题目，只有一个字符干扰
 *
 */
public class LeetCode680 {

    /**
     *解答成功:
     * 			执行耗时:9 ms,击败了55.13% 的Java用户
     * 			内存消耗:40.3 MB,击败了60.27% 的Java用户
     * @param s
     * @return
     */
    public static boolean validPalindrome(String s) {
        if(s==null) return false;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                //左或者右移动一位，如果不是回文字符，肯定不是了
                return isPalindrome(s,i,j-1)|| isPalindrome(s,i+1,j);
            }
        }
        return true;
    }

    /**
     * 判断是否为回文
     * @param s
     * @param i
     * @param j
     * @return
     */
    private static boolean isPalindrome(String s, int i, int j) {
        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, Long> map = TimerUtil.gapTimeStart();
        //abca,deeee
        String s= "deeee";
        boolean result = validPalindrome(s);
        System.out.println(TimerUtil.gapTimeStatistic(map));
        System.out.println(result);
    }
}
