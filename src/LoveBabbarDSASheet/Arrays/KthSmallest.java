package LoveBabbarDSASheet.Arrays;

import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        for(int i=0; i<k-1; i++){
            pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int [] input = new int[] {7,10,4,3,20,15};
        System.out.println(kthSmallest(input, 3));
    }
}
