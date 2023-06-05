package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int [] input = new int[] {0,2,1,2,0};
        System.out.println(Arrays.toString(sort012(input, input.length)));
    }
}
