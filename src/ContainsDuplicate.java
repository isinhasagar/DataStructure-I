/* Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.

Time Complexity = O(n)
 */

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean calculate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(numbers.contains(nums[i]))
                return true;
            numbers.add(nums[i]);
        }
        return false;
    }

    public static void main (String a[]) {
        int[] input = new int[] {1,2,3,4,5};
        System.out.println(ContainsDuplicate.calculate(input));
    }
}
