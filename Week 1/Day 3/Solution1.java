import java.util.*;
public class Solution1 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==1)
            return;
        int i = 0, j = -1, temp;
        for(i=0;i<n;i++)
            if(nums[i] == 0){
                j=i;
                break;
            }
        if(j== -1)
            return;
        for(i = j+1; i<n; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
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
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}