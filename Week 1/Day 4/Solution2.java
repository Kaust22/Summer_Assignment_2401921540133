import java.util.*;
public class Solution2 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length, i, j, o=0, p=0;
        if (m * n != r * c) {
            return mat;
        }
        int newMat[][] = new int[r][c];
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                if(p==c){
                    o++;
                    p=0;
                }
                newMat[o][p] = mat[i][j];
                p++;
            }
        }
        return newMat;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of the new matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] newMat = s.matrixReshape(mat, r, c);
        System.out.println("The reshaped matrix is:");
        for(int i=0; i<newMat.length; i++){
            for(int j=0; j<newMat[0].length; j++){
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}