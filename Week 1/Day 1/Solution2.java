import java.util.*;
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        int p1 = 0, p2 = 1;
        for(p2=1; p2<nums.length; p2++){
            if(nums[p1] != nums[p2]){
                nums[++p1] = nums[p2];
            }
        }
        return p1+1;
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
        int res = s.removeDuplicates(nums);
        System.out.println(res);
    }   
}