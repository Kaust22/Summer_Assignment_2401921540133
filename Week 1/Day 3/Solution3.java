import java.util.*;
public class Solution3 {
    public int maxArea(int[] height) {
        int l=0, r, water, maxWater = 0, n;
        n = height.length;
        r = n-1;
        if(n<=1){
            return 0;
        }
        while(r>l){
            water = (r-l) * Math.min(height[l],height[r]);
            maxWater = Math.max(water, maxWater);
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxWater;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println(s.maxArea(height));
    }
}