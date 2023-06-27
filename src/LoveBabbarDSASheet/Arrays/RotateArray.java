package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotateByOne(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }

    public static int[] rotateByK(int[] arr, int k){
        // Calculate new value of k. k=k%n. Here if K was 500 and the array size was 7, we have reduced the k to be 3.

        int length = arr.length;
        k = k%length;

        reverseArray(arr, 0, length -1);
        reverseArray(arr, 0, k -1);
        reverseArray(arr, k, length -1);

        return arr;
    }

    private static void reverseArray(int[] arr, int start, int end){
        for(int i=start, j=end; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int [] input = new int[] {1,2,3,4,5,6,7};
        int [] input2 = new int[] {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateByOne(input, input.length)));
        System.out.println(Arrays.toString(rotateByK(input2, 3)));
    }
}
