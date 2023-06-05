package OtherPrograms;

import java.util.PriorityQueue;

public class MaxProfit {

    public static int getProfit(int[] arr){
        if(arr.length <= 1)
            return 0;
        int diff = arr[1] - arr[0];
        int minNumber = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - minNumber > diff)
                diff = arr[i] - minNumber;
            if(arr[i] < minNumber)
                minNumber = arr[i];
        }
        return diff;
    }

    public static void main(String[] args) {
        int [] input = new int[] {200,2,98,5,89,20,100,1,2};
        System.out.println(getProfit(input));
    }

}
