/*
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */

package LeetCode75.ArraysStrings;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    // Does not work when input contains a zero value
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        for(int i=0; i<=nums.length-1; i++){
            product = product*nums[i];
        }
        for(int i=0; i<=nums.length-1; i++){
            int temp = product/nums[i];
            result[i] = temp;
        }
        return result;
    }

    // Brute Force O(n*n)
    public static int[] productExceptSelfBruteForce(int[] nums){
        int[] output = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int mul=1;
            for(int j=0; j<nums.length; j++){
                if(j!= i)
                    mul = mul * nums[j];
            }
            output[i] = mul;
        }
        return output;
    }

    /*
    Input : [1,2,3,4]
    Left Products: [1,1,2,6]
    Right Products: [24,12,4,1]
    Output : [24,12,8,6]
     */
    public static int[] productArrayExceptSelf(int[] nums) {
        int N = nums.length;
        int[] leftProducts = new int[N];
        int[] rightProducts = new int[N];
        int[] output = new int[N];
        leftProducts[0] = 1;
        rightProducts[N-1]  =1;

        for(int i=1; i<N; i++){
            leftProducts[i] = nums[i-1] * leftProducts[i-1];
        }
        for(int i=N-2; i>=0; i--){
            rightProducts[i] = nums[i+1] * rightProducts[i+1];
        }
        for(int i=0; i<N; i++){
            output[i] = leftProducts[i] * rightProducts[i];
        }
        return output;
    }

    // Best Optimised Approach
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i=n-1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = new int[] {-1,1,0,-3,3};
        int[] input2 = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(input2)));
        System.out.println(Arrays.toString(productArrayExceptSelf(input1)));
        System.out.println(Arrays.toString(productExceptSelfBruteForce(input2)));
        System.out.println(Arrays.toString(productExceptSelf1(input2)));
    }
}
