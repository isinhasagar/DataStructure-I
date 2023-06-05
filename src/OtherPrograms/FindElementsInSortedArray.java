package OtherPrograms;

public class FindElementsInSortedArray {

    public static int binarySearch(int[] arr, int key){
        int low = arr[0];
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == key)
                return mid;
            if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[] {1,2,3,4,5,6};
        System.out.println(binarySearch(input, 3));
    }
}
