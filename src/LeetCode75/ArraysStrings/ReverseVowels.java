package LeetCode75.ArraysStrings;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] ch = s.toCharArray();

        while(start<end){
            if(!isVowel(ch[start]))
                start++;
            else if(!isVowel(ch[end]))
                end--;
            else{
                char temp = ch[end];
                ch[end] = ch[start];
                ch[start] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);

    }

    static boolean isVowel(char c) {
        String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.print(reverseVowels("hello"));
    }
}
