package InterviewExample;
import java.util.*;
/* 
Given an m x n matrix, return all elements of the matrix in spiral order.
Example:
Input: matrix = [[1,2,3], [4,5,6], [7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Approach:

* Iterate through all the cell of the matrix.
* Starting at the top left corner of the matrix,
prints encountered elements in a clockwise manner.
* The clockwise direction: to right, to bottom, to left, and to top
    * Row direction: 
        * Index will be the same when approaching to the right.
        * Index will be increased 1 when approaching to the bottom.
        * Index will be the same when approaching to the left.
        * Index will be decreased 1 when approaching to the top.
        * So rowdirection = [0, 1, 0, -1] 

    * Column direction: 
        * Index will be increased 1  when approaching to the right.
        * Index will be the same when approaching to the bottom.
        * Index will be be decreased 1 when approaching to the left.
        * Index will be the same when approaching to the top.
        * So coldirection = [1, 0, -1, 0] 

    for each element in the matrix of m x n elements
        add the element at current row and column to a List
        mark it as already visit
        next row element = current row element + position of the next row element
        next col element = current col element + position of the next col element
        if next row and col elements >=0 and < length of rows and columns and not visited,
            current row element = next row element
            current col element = next col element
        else (when reaching the border- when next row and col element > rows and columns length-
                change the direction)
            direction = direction + 1 % 4;
            current row element = current row element +rowdirection[direction]
            current col element = current col element + coldirection[direction]
    return list
            
Reference:
    *  https://leetcode.com/problems/spiral-matrix/
    *  https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

*/

public class SpiralMatrix {
    public static List<Integer> printSpiralOrder(int[][] matrix){
        List<Integer>result = new ArrayList<>();
        if(matrix.length == 0) return result;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int currentRow = 0, currentCol = 0, direction = 0;
        boolean[][] visited = new boolean[rows][columns];
        int[] rowDirection = {0, 1, 0, -1};
        int[] colDirection = {1, 0, -1, 0};

        for(int i = 0; i < rows * columns; i++){
            result.add(matrix[currentRow][currentCol]);
            visited[currentRow][currentCol] = true;
            int nextRow = currentRow + rowDirection[direction];
            int nextCol = currentCol + colDirection[direction];

            if(nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < columns
                && !visited[nextRow][nextCol] ){
                    currentRow = nextRow;
                    currentCol = nextCol;
            }
            else{
                direction = (direction + 1) % 4;
                currentRow = currentRow + rowDirection[direction];
                currentCol = currentCol + colDirection[direction];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(printSpiralOrder(matrix));
    }
}
