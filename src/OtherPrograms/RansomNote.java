package OtherPrograms;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine){
        if(ransomNote.length() > magazine.length())
            return false;

        HashMap<Character, Integer> magazineFreq = new HashMap<>();
        HashMap<Character, Integer> ransomNoteFreq = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char c = magazine.charAt(i);
            magazineFreq.put(c, magazineFreq.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            ransomNoteFreq.put(c, ransomNoteFreq.getOrDefault(c, 0) + 1);
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(magazineFreq.containsKey(ransomNote.charAt(i))) {
                if(ransomNoteFreq.get(ransomNote.charAt(i)) > magazineFreq.get(ransomNote.charAt(i)))
                    return false;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = RansomNote.canConstruct("aa", "aab");
        System.out.println(result);
    }
}
