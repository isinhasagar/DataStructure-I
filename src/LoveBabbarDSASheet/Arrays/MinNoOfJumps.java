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
    public static void main(String[] args) {
        int [] input = new int[] {2,3,1,1,2,4,2,0,1,1};
        //int [] input = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(input));
    }
}
