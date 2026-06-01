import java.util.*;
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int i,c,n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(i=0; i<n; i++){
            c = target - nums[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c), i};
            }
            else 
                map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int[] res = s.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}