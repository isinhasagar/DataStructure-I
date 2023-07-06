package LeetCode75.ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            max = Math.max(candies[i], max);
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = new int[]{2,3,5,1,3 };
        System.out.print(kidsWithCandies(candies, 3));
    }
}
