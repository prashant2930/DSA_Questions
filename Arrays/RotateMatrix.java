////Leetcode 48 We have to rotate the given matrix by 90 degrees in place
//firstly we transposed the matrix for optimal solution by swapping the index for example arr[i][j]=arr[j][i];
//then reversed each row by using two pointer approach by swapping them until one pointer becomes greaer than other
// final time complexity will be O(n square);


package Arrays;
import java.util.*;
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(matrix)));
    }
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;
    }
}
