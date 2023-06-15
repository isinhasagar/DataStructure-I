/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Solution 2 would be to implement a count array which keeps track of the count of elements by assigning the frequency to its equivalent index
Solution 3 would be traverse the array and mark those indexes as negative which have already appeared in the array.
*/

package LoveBabbarDSASheet.Arrays;
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
