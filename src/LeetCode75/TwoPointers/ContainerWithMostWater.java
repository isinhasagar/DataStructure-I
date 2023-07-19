package LeetCode75.TwoPointers;

public class ContainerWithMostWater {

    // Brute Force Approach
    public static int maxAreaBruteForce(int[] height) {
        int area = 1;
        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                area = Math.min(height[i], height[j]) * (j-i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
    public static int maxArea(int[] height) {
        int area = 1;
        int maxArea = Integer.MIN_VALUE;
        int p1=0;
        int p2=height.length-1;

        while(p1<p2){
            area = Math.min(height[p1], height[p2]) * (p2-p1);
            maxArea = Math.max(maxArea, area);
            if(height[p1] < height[p2])
                p1++;
            else
                p2--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,8,6,2,5,4,8,3,7};
        int[] input1 = new int[]{0,2};
        System.out.println(maxArea(input));
        System.out.println(maxArea(input1));
        System.out.println(maxAreaBruteForce(input));
    }
}