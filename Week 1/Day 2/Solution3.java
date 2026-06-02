import java.util.*;
public class Solution3 {
    public double findMaxAverage(int[] nums, int k) {
        int i;
        double sum = 0, maxsum;
        for(i=0; i<k; i++){
            sum += nums[i];
        }
        maxsum = sum;
        for(i = k; i < nums.length; i++){
            sum += nums[i] - nums[i-k];
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum/k;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        double res = s.findMaxAverage(nums, k);
        System.out.println(res);
    }
}
