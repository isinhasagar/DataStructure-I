package LeetCode75.SlidingWindow;

import java.util.*;

public class MaxmVowelsInSubstring {

    // Sliding window approach
    // a bc i i idef, 3
    public static int maxVowels(String s, int k){
        int count = 0, maxCount = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        for(; right<k; right++){
            if(isVowel(s.charAt(right)))
                count++;
        }
        maxCount = count;
        while(right < s.length()){
            if(isVowel(s.charAt(left))) count--;
            left++;
            if(isVowel(s.charAt(right))) count++;
            right++;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    // Brute Force. TC O(n*n*n)
    public static int maxVowelsInString(String s, int t){
        List<String> ls = new ArrayList<>();
        ls.add("");

        int maxVowel = Integer.MIN_VALUE;
        int vowelCount = 0;
        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<t; j++){
                if(t>s.length())
                    break;
                sb = sb.append(s.charAt(j));
            }
            if(t>s.length())
                break;
            t++;
            vowelCount = countVowel(sb.toString());
            maxVowel = Math.max(maxVowel, vowelCount);
        }
        return maxVowel;
    }

    private static int countVowel(String s) {
        int count = 0;
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            if(isVowel(c[i]))
                count++;
        }
        return count;
    }

    static boolean isVowel(char c) {
        String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(c) != -1;

        //return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}
