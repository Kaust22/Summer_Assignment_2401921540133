import java.util.*;
public class Solution2 {
    public boolean isSubsequence(String s, String t) {
        int n = t.length(), m = s.length(), i, j=0;
        if(m>n)
            return false;
        if(m==0)
            return true;
        for(i=0; i<n; i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
                if(j == m)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s:");
        String s = sc.nextLine();
        System.out.println("Enter the string t:");
        String t = sc.nextLine();
        System.out.println(sol.isSubsequence(s, t));
    }
}