import java.util.*;
public class Solution3 {
    public boolean repeatedSubstringPattern(String s) {
        String twice = s+s;
        return twice.substring(1, twice.length()-1).contains(s);
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println(sol.repeatedSubstringPattern(s));
    }
}
