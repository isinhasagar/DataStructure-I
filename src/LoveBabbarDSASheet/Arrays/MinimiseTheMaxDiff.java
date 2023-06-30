/*
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

 */

package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;

public class MinimiseTheMaxDiff {

    public static int getMinDiff(int[] arr, int size, int k){
        if(size==1) return 0;
        Arrays.sort(arr);
        int ans = arr[size-1] - arr[0];
        int min, max;

        for(int i = 1; i<size; i++){
            if(arr[i]-k < 0) continue;

            max = Math.max(arr[i-1]+k, arr[size-1]-k);
            min = Math.min(arr[0]+k, arr[i]-k);

            ans = Math.min(ans, max - min);
        }
        return  ans;
    }
    public static void main(String[] args) {
        int [] input = new int[] {1, 5, 8, 10};
        System.out.println(getMinDiff(input, input.length, 4));
    }
}
