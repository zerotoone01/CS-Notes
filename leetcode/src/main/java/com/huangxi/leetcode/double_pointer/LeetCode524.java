package com.huangxi.leetcode.double_pointer;

import java.util.Arrays;
import java.util.List;

/**
 * @author huang.luo.jun
 * @description
 * @date 2020-12-02
 *
 * 524.Longest Word in Dictionary through Deleting (Medium)
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 *
 * Output:
 * "apple"
 * 题目描述：删除 s 中的一些字符，使得它构成字符串列表 d 中的一个字符串，找出能构成的最长字符串。如果有多个相同长度的结果，返回字典序的最小字符串。
 *
 * 通过删除字符串 s 中的一个字符能得到字符串 t，可以认为 t 是 s 的子序列，我们可以使用双指针来判断一个字符串是否为另一个字符串的子序列。
 */
public class LeetCode524 {
    public String findLongestWord(String s, List<String> d) {
        //暴力搜索，一个个比对
        String longestWord = "";
        for (String item:d) {
            int ll = longestWord.length();
            int il = item.length();
            if(ll>il || (ll==il&&longestWord.compareTo(item)<0)){
                continue;
            }
            if(isSubStr(s,item)){
                longestWord = item;
            }

        }
        return longestWord;
    }

    private boolean isSubStr(String s, String target){
        int i=0,j=0;
        while (i<s.length() && j<target.length()){
            if(s.charAt(i)==target.charAt(j)){
                j++;
            }
            i++;
        }
        //巧妙
        return j==target.length();
    }

    public static void main(String[] args) {
        String s="abpcplea";
        List<String> target = Arrays.asList("ale","apple","monkey","plea");

    }

}
