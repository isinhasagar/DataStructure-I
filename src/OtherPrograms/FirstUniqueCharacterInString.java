package OtherPrograms;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static int firstUniqChar(String str){
        HashMap<Character, Integer> answer = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(answer.containsKey(c))
                answer.put(c, answer.get(c) + 1);
            else
                answer.put(c, 1);
        }
        for(int i=0; i< str.length(); i++){
            char c = str.charAt(i);
            if(answer.get(c) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstUniqueCharacterInString.firstUniqChar("LeetCode"));
    }

}
