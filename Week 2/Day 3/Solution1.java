import java.util.*;
public class Solution1 {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length(), i, j, f=0;
        for(i=0; i<=n-m; i++){
            if(haystack.substring(i, i+m).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the haystack:");
        String haystack = sc.nextLine();
        System.out.println("Enter the needle:");
        String needle = sc.nextLine();
        System.out.println(sol.strStr(haystack, needle));
    }
}