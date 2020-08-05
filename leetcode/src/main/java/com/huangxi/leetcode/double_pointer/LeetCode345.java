package com.huangxi.leetcode.double_pointer;

import com.huangxi.util.TimerUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

//使用双指针，一个指针从头向尾遍历，一个指针从尾到头遍历，当两个指针都遍历到元音字符时，交换这两个元音字符。
//
//为了快速判断一个字符是不是元音字符，我们将全部元音字符添加到集合 HashSet 中，从而以 O(1) 的时间复杂度进行该操作。
//
//时间复杂度为 O(N)：只需要遍历所有元素一次
//空间复杂度 O(1)：只需要使用两个额外变量
/**
 * 345. Reverse Vowels of a String (Easy)
 * Given s = "leetcode", return "leotcede".
 */
public class LeetCode345 {
    private final static HashSet<Character> vowels = new HashSet(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static String reverseVowels(String s) {
        if(s==null) return null;
        int i=0,j=s.length()-1;
        char[] result = new char[s.length()];
        while (i<=j){
            char ci= s.charAt(i);
            char cj = s.charAt(j);
            if(!vowels.contains(ci)){
                result[i]=ci;
                i++;
            }else if(!vowels.contains(cj)){
                result[j]=cj;
                j--;
            }else{
                result[i]=cj;
                result[j]=ci;
                i++;
                j--;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Map<String, Long> map = TimerUtil.gapTimeStart();
        String s="leetcode";
        String result = reverseVowels(s);
        String timeCost = TimerUtil.gapTimeStatistic(map);
        System.out.println("before: "+s+", after: "+result);
        System.out.println(timeCost);
    }
}
