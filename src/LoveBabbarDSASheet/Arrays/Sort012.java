package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;

// Solution 1: Sort the array. O(nlogn)
// Solution 2: Traverse the array and keep count of 0s, 1s and 2s and fill the array with same count.

public class Sort012 {
    public static int[] sort012(int a[], int n)
    {
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(a[mid] == 0){
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                mid++;
                low++;
            }
            else if(a[mid] == 1)
                mid++;
            else{
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
        return a;
    }

    public static int[] sort(int a[], int n){
        int zero = 0, one = 0, two = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] == 0) zero++;
            if(a[i] == 1) one++;
            if(a[i] == 2) two++;
        }
        for(int i=0; i<zero; i++) a[i] = 0;
        for(int i=zero; i<one+zero; i++) a[i] = 1;
        for(int i=one+zero; i<a.length; i++) a[i] = 2;

        return a;
    }

    public static void main(String[] args) {
        int [] input = new int[] {0,2,1,2,0,2,2};
        System.out.println(Arrays.toString(sort012(input, input.length)));
        System.out.println(Arrays.toString(sort(input, input.length)));
    }
}
