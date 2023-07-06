package LeetCode75.ArraysStrings;

public class ReverseWordsInString {
    public static String reverseWords(String s){
        StringBuilder sb  = new StringBuilder();
        String[] str = s.split(" ");
        for(int i=str.length-1; i>=0; i--){
            if(str[i]=="") continue;
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();

    }
    public static void main(String[] args) {
        System.out.print(reverseWords("a good   example"));
    }
}
