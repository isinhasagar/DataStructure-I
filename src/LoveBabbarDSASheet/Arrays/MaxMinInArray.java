package LoveBabbarDSASheet.Arrays;

public class MaxMinInArray {

    public static int findSum(int A[],int N) {
        int max = 0, min = 0, sum = 0;

        if (N == 1) {
            max = A[0];
            min = A[0];
            return max + min;
        }

        if (A[0] > A[1]) {
            max = A[0];
            min = A[1];
        } else {
            max = A[1];
            min = A[0];
        }

        for (int i = 2; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }
        sum = min + max;

        return sum;
    }
    public static void main(String[] args) {
        int [] input = new int[] {1, 5, 8, 10};
        System.out.println(findSum(input, input.length));
    }
}
