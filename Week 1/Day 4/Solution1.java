import java.util.*;
public class Solution1 {
    public int diagonalSum(int[][] mat) {
        int sum = 0, i, j, n = mat.length;
        for(i=0; i<n; i++){
            sum += mat[i][i];
            j = n - i - 1;
            if(i != j)
                sum += mat[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(s.diagonalSum(mat));
    }
}