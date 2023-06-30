/*
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 */

package LoveBabbarDSASheet.Arrays;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        Stack<int[]> stack = new Stack<>();
        stack.add(intervals[0]);

        for(int i=1; i<intervals.length; i++){
            int startPoint2 = intervals[i][0];
            int endPoint2 = intervals[i][1];

            int[] popArray = stack.pop();

            int startPoint1 = popArray[0];
            int endPoint1 = popArray[1];

            if(endPoint1 >= startPoint2){
                int[] merge = new int[]{startPoint1, Math.max(endPoint1, endPoint2)};
                stack.add(merge);
            }
            else{
                stack.add(popArray);
                stack.add(intervals[i]);
            }
        }

        int[][] output = new int[stack.size()][2];
        for(int i=output.length-1; i>=0; i--){
            int[] popArray = stack.pop();
            output[i][0] = popArray[0];
            output[i][1] = popArray[1];
        }

        return output;
    }
    public static void main(String[] args) {
        int[][] input = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(Arrays.deepToString(mergeIntervals(input)));
    }
}
