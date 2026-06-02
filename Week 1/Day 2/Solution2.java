import java.util.*;

public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ele = new HashSet<>();
        for(int i : nums){
            if(ele.contains(i))
                return true;
            else
                ele.add(i);
        }
        return false;
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
        boolean res = s.containsDuplicate(nums);
        System.out.println(res);
    }
}
