package OtherPrograms;

public class PalindromeString {

    public void checkPalindrome(String input){
        char[] s = input.toCharArray();
        String rev = "";
        for(int i=input.length() - 1; i>=0; i--){
            rev = rev + s[i];
        }
        if(rev.equals(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] s){
        PalindromeString ps = new PalindromeString();
        ps.checkPalindrome("level");
    }
}
