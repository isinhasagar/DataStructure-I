package LeetCode75.TwoPointers;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int area = 1;
        int maxArea = Integer.MIN_VALUE;
        int length = height.length;
        int p1=0;
        int p2=length-1;

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
    }
}