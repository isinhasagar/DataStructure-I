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

    // Brute Force Approach
    public static int maxSumSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++)
                    sum = sum+nums[k];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    // Optimise Approach 1
    public static int maxSumSub(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length; j++){
                sum = sum+nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    // Kadane's Algorithm
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
        System.out.println(MaximumSubArray.maxSumSubArray(input));
        System.out.println(MaximumSubArray.maxSumSub(input));
    }
}
