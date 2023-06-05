package OtherPrograms;

public class RemoveDuplicatesFromSortedArray {
    public void removeDuplicates(int[] arr){
        int j=1;
        for(int i=0; i<arr.length -1; i++){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i+1];
                j++;
            }
        }
        for(int i=0; i<arr.length -1; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = new int[] {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        obj.removeDuplicates(input);
    }
}
