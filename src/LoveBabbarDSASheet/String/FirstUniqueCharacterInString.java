package LoveBabbarDSASheet.String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public static int firstUniqChar(String str){

        // Build hashmap with all characters and their count.
        HashMap<Character, Integer> answer = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(answer.containsKey(c))
                answer.put(c, answer.get(c) + 1);
            else
                answer.put(c, 1);
        }

        // Loop through map and print duplicates in sorted order.
        for (Map.Entry mapElement : answer.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());

            if (value > 1)
                System.out.println(key
                        + ", count = " + value);
        }

        // Find the first unique character
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
