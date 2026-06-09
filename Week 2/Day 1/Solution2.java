import java.util.*;
public class Solution2 {
    public int firstUniqChar(String s) {
        int i;
        int[] freq = new int[26];
        for(i = 0; i < s.length(); i++){
            freq[(int)(s.charAt(i) - 'a')]++;
        }
        for(i = 0; i < s.length(); i++){
            if(freq[(int)(s.charAt(i) - 'a')] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(sol.firstUniqChar(s));
    }
}