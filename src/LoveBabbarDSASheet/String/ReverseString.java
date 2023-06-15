package LoveBabbarDSASheet.String;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        int length = s.length;
        for(int i =0; i<length/2; i++){
            char temp = s[i];
            s[i] = s[length-1-i];
            s[length-1-i] = temp;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseString(new char[]{'h','e','l','l','o'}));
    }
}
