/*
Find out the binary representation of the given number and calculation the number of 1s in it and return that.
How do you calculate that?
Formulae: x & (x-1) where x is the given number in binary form.
To calculate (x-1) -> pick the rightmost number and make it 1 and other right elements to 0. e.g: 1100100 -> 1100011
    x     = 11010000
   x-1    = 11001111
x & (x-1) = 11000000
 */

package LoveBabbarDSASheet.BitManipulation;

public class NumberOf1Bits {
    static int numberOfBits(int n){
        int count=0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBits(6));
    }
}
