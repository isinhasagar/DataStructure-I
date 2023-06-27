package OtherPrograms;

import java.util.HashMap;
import java.util.Map;

public class Interview {
    static int getCount(String str){
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        String b = "";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!(map.containsKey(c))){
                map.put(c, 1);
                b = b+c;
                result = Math.max(result, b.length());
            }
            else{
                b="";
                b = b+c;
            }
        }
        System.out.println(b);
        return result;
    }

    public static void main(String[] args) {
        //abcabcbb
        System.out.println(getCount("pwwkwew"));
    }
}
