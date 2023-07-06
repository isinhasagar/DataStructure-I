/*
Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 */

package LeetCode75.ArraysStrings;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {

        if(nums.length < 3) return false;

        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>mid)
                return true;
            else if(nums[i] > left && nums[i] < mid)
                mid = nums[i];
            else if(nums[i]<left)
                left = nums[i];
        }
        return false;

    }
    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,1,3};
        int[] input2 = new int[]{2,1,5,0,4,6};
        int[] input3 = new int[]{5,4,3,2,1};
        System.out.println(increasingTriplet(input1)); // true
        System.out.println(increasingTriplet(input2)); // true
        System.out.println(increasingTriplet(input3)); // false
    }
}
