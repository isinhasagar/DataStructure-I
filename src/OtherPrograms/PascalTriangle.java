package OtherPrograms;/* Given an integer numRows, return the first numRows of Pascal's triangle.

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int i=1; i<numRows; i++){
            List<Integer> currentList = new ArrayList<>();
            currentList.add(1);
            for(int j=1; j<i; j++){
                currentList.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            currentList.add(1);
            result.add(currentList);
        }
        return result;
    }

    public static void main(String a[]){
        System.out.println(PascalTriangle.generate(5));
    }
}
