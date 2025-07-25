//Leetcode 74
/*
 you have to search in 2d array for target element
 brute force iterate through each element if that is equal to target returrn that
optimal solution: binary search for sorted array intialize row with 0
 and  column with end if the taregt element is greater than last elemnt of column roww++
if the target element is less than last element col--
*/
package Arrays;

public class Searchin2DSortedArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target = 16;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found? " + found);

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        /*     for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                     if (matrix[i][j] == target) {
                         return true;
                     }
                }
             }
             return false;
         }*/
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] > target)
                col--;
            else
                row++;

        }
        return false;
    }


}
