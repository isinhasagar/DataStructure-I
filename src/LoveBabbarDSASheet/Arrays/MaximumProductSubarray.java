package LoveBabbarDSASheet.Arrays;

public class MaximumProductSubarray {

    public static int maxSubArray(int[] nums){
        int currentprod = 1;
        int maximumProd = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currentprod = currentprod * nums[i];
            maximumProd = Math.max(Math.max(currentprod, nums[i]), maximumProd);
            if(currentprod == 0)
                currentprod =1;
        }
        return maximumProd;
    }

    public static void main(String a[]){
        int input[] = new int[] {2,-5,-2,-4,3};
        System.out.println(maxSubArray(input));
    }
}
