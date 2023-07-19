package LeetCode75.SlidingWindow;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        // Average the first k sub array
        int sum=0;
        for(int i=0; i<k; i++){
            sum = sum+nums[i];
        }
        double maxAvg = (double) sum /k;

        // Get the next value and compute average.
        double avg= 0;
        for(int i=1; i<nums.length -k +1; i++){
            sum = sum-nums[i-1];
            sum = sum + nums[i+k-1];
            avg = (double)sum/k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(input, 4));
    }
}
