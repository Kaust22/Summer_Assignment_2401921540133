import java.util.*;
public class Solution2 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, i, l = 0, h;
        int res[] =  new int[n];
        h=n-1;
        for(i=n-1; i>=0; i--){
            if(Math.abs(nums[l]) > Math.abs(nums[h])){
                res[i] = nums[l] * nums[l];
                l++;
            }
            else{
                res[i] = nums[h] * nums[h];
                h--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] res = s.sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }
}