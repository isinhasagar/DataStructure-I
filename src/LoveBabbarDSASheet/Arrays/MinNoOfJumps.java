package LoveBabbarDSASheet.Arrays;

public class MinNoOfJumps {
    public static int minJumps(int[] arr){

        int jump = 0, position = 0, destination = 0;
        for(int i=0; i<arr.length-1;i++){
            destination = Math.max(destination, arr[i]+i);

            if(position == i){
                position = destination;
                jump++;
            }
        }
        return jump;
    }

    public static int minNoJumps (int[] arr){
        int length = arr.length;
        int count = 0;
        int remainingLength = length;
        for(int i=0; i<arr.length; ){
            if(arr[i] == 0)
                return -1;
            count++;
            remainingLength = remainingLength - (arr[i]+i);
            i = arr[i];
            if(remainingLength <= 0)
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        //int [] input = new int[] {2,3,1,1,2,4,2,0,1,1};
        int [] input = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minNoJumps(input));
        System.out.println(minJumps(input));
    }
}
