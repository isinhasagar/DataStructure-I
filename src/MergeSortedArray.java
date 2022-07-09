/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this,
nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
nums2 has a length of n

Input:
    nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Time Complexity = O(m + n)
*/

public class MergeSortedArray {
    public static void calculate(int[] a, int[] b, int m, int n) {
        int pointer1 = m-1, pointer2 = n-1, i = m+n-1;
        while(pointer2 >= 0){
            if(pointer1 >= 0 && a[pointer1] > b[pointer2]){
                a[i--] = a[pointer1--];
                //i--;
                //p1--;
            }
            else {
                a[i--] = b[pointer2--];
                //i--;
                //p2--;
            }
        }
    }

    public static void main(String arr[]){
        int a[] = new int[] {1,2,3,0,0,0};
        int b[] = new int[] {2,5,6};
        MergeSortedArray.calculate(a, b, 3, 3);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
