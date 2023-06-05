package LoveBabbarDSASheet.Arrays;

public class ReverseArray {
    public static String reverseWord(String str)
    {
        String result = "";
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            result = ch+result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("GeeksForGeeks"));
    }
}
