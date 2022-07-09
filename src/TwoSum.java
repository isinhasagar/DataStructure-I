/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Input:
       nums = [2,7,11,15], target = 9
       Output: [0,1]
       Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Time Complexity = O(n)
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] calculate(int nums[], int target){
        Map<Integer, Integer> num_Map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(num_Map.containsKey(complement))
                return new int[] {num_Map.get(complement), i};
            num_Map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not Found");
    }

    public static void main(String a[]){
        int input[] = new int[] {2,7,11,15};
        int target = 9;
        System.out.print(TwoSum.calculate(input, target));
    }
}
