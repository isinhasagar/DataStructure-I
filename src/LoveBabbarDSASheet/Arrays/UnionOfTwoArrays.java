package LoveBabbarDSASheet.Arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        Set<Integer> map = new HashSet<>();
        for(int i=0; i<n; i++){
            map.add(a[i]);
        }
        for(int i=0; i<m; i++){
            map.add(b[i]);
        }
        return map.size();
    }

    public static void main(String[] args) {
        int [] input1 = new int[] {1,2,3,4,5};
        int [] input2 = new int[] {1,2,3};
        System.out.println(doUnion(input1, input1.length, input2, input2.length));
    }
}
