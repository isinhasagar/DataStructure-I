/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Kadane's Algorithm
Input:
    nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

Time Complexity = O(n)
*/

package LoveBabbarDSASheet.Arrays;

public class MaximumSubArray {
    public static int maxSubArray(int[] nums){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            //currentSum = currentSum + nums[i];
            maximumSum = Math.max(currentSum, maximumSum);
            //if(currentSum < 0)
            //    currentSum = 0;
        }
        return maximumSum;
    }

    public static void main(String a[]){
        int input[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSubArray.maxSubArray(input));
    }
}
