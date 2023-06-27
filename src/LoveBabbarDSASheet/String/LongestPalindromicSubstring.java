package LoveBabbarDSASheet.String;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestPalindromicSubstring {

    // Brute Force approach
    // TC: O(n^3)
    public static int longestPalindromic(String str){
        List<String> result = new ArrayList<>();
        String s = "";
        for(int i=0; i<str.length(); i++){
            s="";
            for(int j=i; j<str.length(); j++){
                s = s + str.charAt(j);
                if(checkPalindrome(s))
                    result.add(s);
            }
        }
        return result.stream().max(Comparator.comparingInt(String :: length)).get().length();
    }

    // Expand from center approach
    // TC: O(n^2)
    public static String longestPalindromicSubstring(String str){
        int start = 0, end = 0;
        for(int i=0; i<str.length(); i++){
            int len1 = expandFromCenter(str, i, i+1);
            int len2 = expandFromCenter(str, i, i);
            int length = Math.max(len1, len2);

            if(end-start < length){
                start = i-(length-1)/2;
                end = i+length/2;
            }
        }
        return str.substring(start, end+1);
    }

    private static int expandFromCenter(String str, int i, int j){
        while(i>=0 && j<str.length() && str.charAt(i) == str.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }

    private static boolean checkPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindromic("babad"));
        System.out.println(longestPalindromicSubstring("ababad"));
    }
}
