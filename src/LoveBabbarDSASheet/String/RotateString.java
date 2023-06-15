/*
Input: S1 = ABCD, S2 = CDAB
Output: Strings are rotations of each other

Input: S1 = ABCD, S2 = ACBD
Output: Strings are not rotations of each other
*/

package LoveBabbarDSASheet.String;

public class RotateString {
    public static boolean rotateString(String a, String b){
        return (a.length() == b.length() && (a+a).contains(b));
    }
    public static void main(String[] args) {
        System.out.println(rotateString("ABCD", "CDAB"));
        System.out.println(rotateString("ABCD", "ACBD"));
    }
}
