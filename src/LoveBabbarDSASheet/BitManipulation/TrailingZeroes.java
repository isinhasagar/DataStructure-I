/*
Binary representation of 16 is 10000. So number of trailing zeroes are 4.
 */

package LoveBabbarDSASheet.BitManipulation;

public class TrailingZeroes {
    static int countZeroes(int n){
        int count=0;
        while(n%2 == 0){
            n = n>>1; // right shift by 1
            //n/=2 or n= n/2;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countZeroes(16));
    }
}
