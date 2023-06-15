package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;

public class MaxMinInArray {

    public static int[] findSum(int A[],int N) {
        int max = 0, min = 0, sum = 0;

        if (N == 1) {
            max = A[0];
            min = A[0];
            return new int[]{min,max};
        }

        if (A[0] > A[1]) {
            max = A[0];
            min = A[1];
        } else {
            max = A[1];
            min = A[0];
        }

        for (int i = 2; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }
        sum = min+max;
        System.out.println("Sum is: " + sum);
        return new int[] {min,max};
    }

    public static int[] findMinAndMax(int arr[], int n){
        int max = arr[0], min = arr[0];
        for(int i=1; i<arr.length; i++){
            //min = Math.min(arr[i], min);
            //max = Math.max(arr[i], max);
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        return new int[] { min, max };
    }
    public static void main(String[] args) {
        int [] input = new int[] {1, 5, 8, 10, 23, 2};
        System.out.println(Arrays.toString(findSum(input, input.length)));
        System.out.println(Arrays.toString(findMinAndMax(input, input.length)));
    }
}
