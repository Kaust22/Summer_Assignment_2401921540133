import java.util.*;
public class Solution3 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1)
            return "";
        int i;
        StringBuilder prefix = new StringBuilder(strs[0]);
        for(i=1; i< strs.length; i++){
            while(strs[i].indexOf(prefix.toString()) != 0){
                prefix.setLength(prefix.length()-1);
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        System.out.println(sol.longestCommonPrefix(strs));
    }
}