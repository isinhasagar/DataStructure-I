package LeetCode75.SlidingWindow;

public class LongestSubarrayOf1s {

    // Better Sliding Window Approach
    public static int longestSubarrayOnes(int[] nums){
        int i = 0,j = 0, result = 0, lastIndex = -1;

        for(j=0; j<nums.length; j++){
            if(nums[j] == 0){
                i=lastIndex+1;
                lastIndex = j;
            }
            result = Math.max(result, j-i);
        }
        return result;
    }

    // Slinding Window Approach  [0,1,1,1,0,1,1,0,1]
    public static int longestSubarrayofOnes(int[] nums){
        int i=0, j=0, zeroCount=0, result=0;

        for(j=0; j<nums.length; j++){
            if(nums[j]==0) zeroCount++;
            while(zeroCount > 1){
                if(nums[i]==0) zeroCount--;
                i++;
            }
            result = Math.max(result, j-i);
        }
        return result;
    }

    // Brute Force
    public static int longestSubarray(int[] nums){
        int N = nums.length;
        int result = 0, zeroesCount = 0;

        for(int i=0; i<N; i++){
            if(nums[i] == 0){
                zeroesCount++;
                result = Math.max(result,findMax(nums, i));
            }
        }
        if(zeroesCount == 0)
            return N-1;
        return result;
    }

    private static int findMax(int[] nums, int skipIndex){
        int currentLength=0, maxLength=0;

        for(int i=0; i<nums.length;i++){
            if(i==skipIndex)
                continue;
            if(nums[i] == 1){
                currentLength++;
                maxLength = Math.max(currentLength,maxLength);
            }
            else
                currentLength=0;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] input = new int[] {0,1,1,1,0,1,1,0,1};
        int[] input1 = new int[]{1,1,0,1};
        int[] input2 = new int[]{1,1,1};
        System.out.println(longestSubarray(input));
        System.out.println(longestSubarray(input1));
        System.out.println(longestSubarray(input2));

        System.out.println(longestSubarrayofOnes(input));
        System.out.println(longestSubarrayofOnes(input1));
        System.out.println(longestSubarrayofOnes(input2));

        System.out.println(longestSubarrayOnes(input));
        System.out.println(longestSubarrayOnes(input1));
        System.out.println(longestSubarrayOnes(input2));
    }
}
