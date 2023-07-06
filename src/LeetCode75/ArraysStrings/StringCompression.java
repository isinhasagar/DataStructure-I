/*
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */

package LeetCode75.ArraysStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringCompression {
    public static int compress(char[] chars){
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<chars.length; i++){
            if(map.containsKey(chars[i]))
                map.put(chars[i], map.get(chars[i])+1);
            else
                map.put(chars[i], 1);
        }
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            char ch = ((char)mapElement.getKey());
            int len = ((int)mapElement.getValue());
            if(len == 1) sb.append(ch);
            else sb.append(ch).append(len);
        }
        chars = sb.toString().toCharArray();
        System.out.println(sb.toString().toCharArray());
        return chars.length;
    }
    public static void main(String[] args) {
        char[] ch1 = new char[]{'a','a','b','b','c','c','c'};
        char[] ch2 = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(ch1));
        System.out.println(compress(ch2));
    }
}
