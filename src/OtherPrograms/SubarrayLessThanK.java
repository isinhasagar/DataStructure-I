package OtherPrograms;

public class SubarrayLessThanK {
    static int countSubArray(int[] arr, int n, int k){
        int start=0, end=0, count=0, sum=arr[0];

        while(start < n && end < n){
            if(sum < k){
                end++;
                if(end>= start)
                    count += end - start;
                if(end < n)
                    sum += arr[end];
            }
            else {
                sum -= arr[start];
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = { 1, 11, 2, 3, 15 };
        System.out.println(countSubArray(input, input.length, 10));
    }
}
