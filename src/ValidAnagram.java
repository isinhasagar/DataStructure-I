import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        for(int i=0; i<s.length(); i++){
            if(charS[i] != charT[i])
                return false;
        }
        return true;
    }

    public static void main(String s[]){
        System.out.println(ValidAnagram.isAnagram("anagram", "nagaram"));
    }
}
