import java.util.*;
public class Solution4 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length, i, sc, sr, ec, er;
        sc = sr =0;
        ec = n-1;
        er = m-1;
        while(sr <= er && sc <= ec){
            //top boundary
            for(i=sc; i <= ec; i++){
                ls.add(matrix[sr][i]);
            }
            //right boundary
            for(i = sr+1; i <= er; i++){
                ls.add(matrix[i][ec]);
            }
            //bottom boundary
            for(i = ec-1; i >= sc; i--){
                if(sr==er)
                    break;
                ls.add(matrix[er][i]);
            }
            //left boundary
            for(i=er-1; i>= sr+1; i--){
                if(sc==ec)
                    break;
                ls.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return ls;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(s.spiralOrder(matrix));
    }
}