package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;

public class RotateArrayByOne {
    public static int[] rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int [] input = new int[] {0,2,1,2,0};
        System.out.println(Arrays.toString(rotate(input, input.length)));
    }
}
