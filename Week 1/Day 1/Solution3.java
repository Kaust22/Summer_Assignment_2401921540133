import java.util.*;
public class Solution3 {
    int maxProfit(int[] prices) {
        int buy, i, profit, maxProfit=0;
        buy = Integer.MAX_VALUE;
        for(i=0; i<prices.length; i++){
            if(buy < prices[i]){
                profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buy = prices[i];
            }

        }
        if(maxProfit < 0)
            return 0;
        return maxProfit;
    }

    public static void main(String[] args){
        Solution3 s = new Solution3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int res = s.maxProfit(nums);
        System.out.println(res);
    }
}
