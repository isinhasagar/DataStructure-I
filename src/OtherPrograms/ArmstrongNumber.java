/*
153 is Armstrong number because 1^3 + 5^3 + 3^3 = 153
 */

package OtherPrograms;

public class ArmstrongNumber {
    static boolean isArmstrong(int number){
        int temp = number;
        int p = 0;
        while(number>0){
            int rem = number%10;
            p=p+(rem*rem*rem);
            number=number/10;
        }
        return temp == p;
    }

    static int nthArmstrongNumber(int n){
        int count=0;
        for(int i=1; i<=Integer.MAX_VALUE; i++){
            int num = i, rem, digit=0, sum=0;
            digit = (int)Math.log10(num)+1;
            while(num>0){
                rem = num%10;
                sum = sum + (int)Math.pow(rem, digit);
                num = num/10;
            }
            if(i==sum)
                count++;
            if(count==n)
                return i;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(nthArmstrongNumber(10));
    }
}
