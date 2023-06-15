/*  Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times
 as it shows in both arrays, and you may return the result in any order.

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */

package LoveBabbarDSASheet.Arrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersect(int[] nums1, int nums2[]){
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> frequencyMap1 = new HashMap<>();
        Map<Integer, Integer> frequencyMap2 = new HashMap<>();

        for(int i=0; i<nums1.length; i++){
            if(frequencyMap1.containsKey(nums1[i]))
                frequencyMap1.put(nums1[i], frequencyMap1.get(nums1[i]) + 1);
            else
                frequencyMap1.put(nums1[i], 1);
        }

        for(int i=0; i<nums2.length; i++){
            if(frequencyMap2.containsKey(nums2[i]))
                frequencyMap2.put(nums2[i], frequencyMap2.get(nums2[i]) + 1);
            else
                frequencyMap2.put(nums2[i], 1);
        }

        for(Integer key : frequencyMap1.keySet()){
            if(frequencyMap2.containsKey(key)){
                int x = Math.min(frequencyMap2.get(key), frequencyMap1.get(key));
                while(x-- > 0){
                    arr.add(key);
                }
            }
        }

        int result[] = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            result[i] = arr.get(i);
        }
        return result;
    }

    public static void main(String a[]){
        int[] nums1 = new int[] {1,2,3,1};
        int[] nums2 = new int[] {2,3};
        System.out.println(Arrays.toString(IntersectionOfTwoArrays.intersect(nums1, nums2)));
    }

}
