/*
Input:
str = "AABEBCDD"
Output: 3
Explanation: ABD is the longest subsequence, and it appears twice in the given string.
Subsequence : Order of appearance is maintained and the string need not be continuous.
 */

package LoveBabbarDSASheet.String;

import java.util.LinkedHashMap;

public class LongestRepeatingSubsequence {

    // This solution will not work in case of 1 sub-sequence
    public static int longestSubsequence(String str){
        // Reason for using LinkedHashMap is it preserves the order of insertion
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i),1);
        }
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i))%2 != 0)
                map.remove(str.charAt(i));
        }
        return map.size();
    }
    public static void main(String[] args) {
        System.out.println(longestSubsequence("axxzxy"));
    }
}
