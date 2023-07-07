package LeetCode75.ArraysStrings;

public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int prev,next;
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if(i==0 || flowerbed[i-1]==0)
                    prev = 0;
                else
                    prev = 1;

                if(i==flowerbed.length-1 || flowerbed[i+1]==0)
                    next = 0;
                else
                    next = 1;

                if(prev == 0 & next ==0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count>=n;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(input, 2));
    }
}