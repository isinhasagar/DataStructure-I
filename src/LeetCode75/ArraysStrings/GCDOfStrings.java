/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */

package LeetCode75.ArraysStrings;

public class GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";

        return str1.substring(0,gcd(str1.length(),str2.length()));
    }

    private static int gcd(int n1, int n2){
        //return n2 == 0 ? n1 : gcd(n2, n1 % n2);
        while(n1%n2 != 0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
