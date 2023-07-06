package LeetCode75.TwoPointers;

import java.util.Arrays;

public class MoveZeroes {

    // Normal Approach
    public static int[] moveZeroes(int[] nums) {
        int [] result = new int[nums.length];
        Arrays.fill(result, 0);

        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }

    // Two pointer approach
    public static int[] zeroesToRight(int[] nums) {
        int left=0,right=0;
        int length = nums.length;
        int temp;
        while(right < length){
            if(nums[right] == 0)
                right++;
            else{
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }

    // Optimal Approach
    public static int[] moveZeroesToRight(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        while(count < nums.length)
            nums[count++] = 0;

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int[] nums1 = new int[]{0,1,0,3,12};
        int[] nums2 = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
        System.out.println(Arrays.toString(zeroesToRight(nums1)));
        System.out.println(Arrays.toString(moveZeroesToRight(nums2)));
    }
}
