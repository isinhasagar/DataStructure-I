/*
Java Program to Check if a string is a valid shuffle of two distinct strings

1XY2 is a valid shuffle of XY and 12
Y1X2 is a valid shuffle of XY and 12
Y21XX is not a valid shuffle of XY and 12
*/

package LoveBabbarDSASheet.String;

import java.util.HashMap;

public class ValidShuffle {

    // TC: O(n)
    public static String validShuffle(String s1, String s2, String result){

        if(s1.length()+s2.length() != result.length())
            return "Not a valid Shuffle.";

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i)))
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            else
                map.put(s1.charAt(i), 1);
        }
        for(int i=0; i<s2.length(); i++){
            if(map.containsKey(s2.charAt(i)))
                map.put(s2.charAt(i), map.get(s2.charAt(i))+1);
            else
                map.put(s2.charAt(i), 1);
        }
        for(int i=0; i<result.length(); i++){
            if(map.containsKey(result.charAt(i))){
                map.put(result.charAt(i), map.get(result.charAt(i))-1);
                if(map.get(result.charAt(i)) == 0)
                    map.remove(result.charAt(i));
            }
            else
                return "Not a valid Shuffle.";
        }
        return "Valid Shuffle";

    }
    public static void main(String[] args) {
        String result = "bbac";
        System.out.println(validShuffle("ab", "bc", result));

    }
}
