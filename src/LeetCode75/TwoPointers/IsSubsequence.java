package LeetCode75.TwoPointers;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t){
        if(s.length() == 0) return true;
        int j=0; // String s

        // i is the pointer for string t
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == s.charAt(j)) j++;
            if(j==s.length()) return true;
        }
        return false;
    }

    // Brute Force
    public static boolean subsequence(String s, String t){
        int temp=0;
        int found = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=temp; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    temp = j;
                    temp++;
                    found++;
                    break;
                }
            }
        }
        return found == s.length();
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("acb","ahbgdc"));
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(subsequence("aaaaaa","bbaaaa"));
    }
}
