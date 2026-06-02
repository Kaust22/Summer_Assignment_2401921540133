import java.util.*;
public class Solution1 {
    public int maxSubArray(int[] nums) {
        int i, n = nums.length, sum = 0, maxSum = Integer.MIN_VALUE;
        for(i=0; i<n; i++){
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            if(sum<0)
                sum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(sol.maxSubArray(nums));
    }
}