package OtherPrograms;

import java.util.HashMap;
import java.util.Map;

public class Interview {
    static int price(int x, int y){
        int sum = 0;

        for(int i=x; i<=y; i++){
            if(isGoldenPrice(i))
                sum = sum+i;
        }
        return sum;
    }

    private static boolean isGoldenPrice(int price){
        int max=0;
        int sum = 0;
        int rem= 0;
        while(price>0){
            rem = price%10;
            max = Math.max(price,rem);
            price = price/10;
            sum = sum+rem;
        }
        if((sum-max)== max)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(price(11,33));
    }
}


