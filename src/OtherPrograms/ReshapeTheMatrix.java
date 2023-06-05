package OtherPrograms;/* You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

*/

public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int column = mat[0].length;

        if((rows * column) != (r * c)) return mat;

        int[][] output_arr = new int[r][c];
        int row_num = 0;
        int col_num = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                output_arr[row_num][col_num] = mat[i][j];
                col_num++;
                if(col_num == c){
                    col_num=0;
                    row_num++;
                }
            }
        }
        return output_arr;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][] { {1,2},{3,4} };
        System.out.println(ReshapeTheMatrix.matrixReshape(mat, 1, 4));
    }
}
