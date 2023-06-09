package LoveBabbarDSASheet.Arrays;

// Solution 1: Create a new array and fill that array in reverse order. Time O(n), Space O(n)
// Solution 2: In the same array swap last element with first element and so on. Time O(n), Space(1)

import java.util.Arrays;

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

    public static void reverseArray(int[] arr){
        int length = arr.length;
        for(int i=0; i<length/2;i++){
            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }
    }

    public static void reverseArrayUsingRecursion(int[] arr, int start, int end){
        if(start > end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArrayUsingRecursion(arr, start +1, end-1);
    }

    public static void main(String[] args) {
        int [] input = new int[] {1,2,3,4,5};
        reverseArray(input);
        System.out.println(Arrays.toString(input));

        int [] input2 = new int[] {2,3,4,5,6};
        reverseArrayUsingRecursion(input2, 0, input2.length - 1);
        System.out.println(Arrays.toString(input2));

        System.out.println(reverseWord("GeeksForGeeks"));
    }
}
