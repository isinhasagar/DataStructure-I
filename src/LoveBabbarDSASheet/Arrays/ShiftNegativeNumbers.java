/*
 Solution 1: Sort the array
 */

package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;

public class ShiftNegativeNumbers {

    static int[] shiftall(int[] arr, int left, int right){
        while(left <= right){

            // Both are negative
            if(arr[left] < 0 && arr[right] < 0)
                left++;

            //Left positive and right negative
            else if(arr[left] > 0 && arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            //Both are positive
            else if(arr[left] > 0 && arr[right] > 0)
                right--;

            else{
                left++;
                right--;
            }
        }
        return arr;
    }

    static int[] shiftNegative(int[] arr, int left, int right){
        while(left < right){
            while(arr[left] < 0) left++;
            while(arr[right] > 0) right--;

            if(left >= right) break;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }

    // Drive code
    public static void main(String[] args)
    {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };

        // Function Call
        System.out.println(Arrays.toString(shiftall(arr, 0, arr.length - 1)));
        System.out.println(Arrays.toString(shiftNegative(arr, 0, arr.length - 1)));
    }
}
