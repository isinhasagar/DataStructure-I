package LeetCode75.SlidingWindow;

class MaxConsecutiveOnes {
    public static int maxOnes(int[] arr, int k){
        int N = arr.length;
        int i=0, j=0, flip = 0, ans = 0;

        while(i<N){
            if(arr[i]==0)
                flip++;
            while(flip>k){
                if(arr[j]==0)
                    flip--;
                j++;
            }
            ans = Math.max(ans, i-j+1);
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxOnes(input, 2));
    }
}
