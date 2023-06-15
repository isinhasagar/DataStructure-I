package LoveBabbarDSASheet.String;

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

    public boolean palindromeString(String input){

        // Step 1: Convert all characters to lower case.
        input = input.toLowerCase();
        StringBuilder b = new StringBuilder();

        // Step 2: Remove all special characters. Consider only digits and alphabets.
        for(int i=0; i<input.length(); i++){
            if(Character.isDigit(input.charAt(i)) || Character.isLetter(input.charAt(i))){
                b.append(input.charAt(i));
            }
        }

        // Step 3: Check for palindrome.
        int length = b.length()-1;
        for(int i=0; i<b.length()/2; i++){
            if(b.charAt(i) != b.charAt(length-i))
                return false;
        }
        return true;
    }

    public static void main(String[] s){
        PalindromeString ps = new PalindromeString();
        ps.checkPalindrome("level");
        System.out.println(ps.palindromeString("level"));
    }
}
