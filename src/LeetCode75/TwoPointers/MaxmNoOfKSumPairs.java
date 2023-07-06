package LeetCode75.TwoPointers;

import java.util.Arrays;

public class MaxmNoOfKSumPairs {

    // Brute Force. TC: O(n*n) Space: O(n)
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int start=0;
        int sum =0;
        int end = nums.length-1;
        while(start<end){
            sum = nums[start] + nums[end];
            if(sum<k)
                start++;
            else if(sum > k)
                end--;
            else{
                count++;
                start++;
                end--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        System.out.println(maxOperations(input, 2));
    }
}
