import java.util.*;
public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(), p1=0, l = 0, maxL = Integer.MIN_VALUE, i;
        if(n==0)
            return 0;
        char str[] = new char[n];
        int freq[] = new int[128];
        for(i = 0; i<n; i++){
            char ch = s.charAt(i);
            freq[ch]++;
            while(freq[s.charAt(i)]>1){
                freq[s.charAt(p1)]--;
                p1++;
            }
            l = i - p1 + 1;
            maxL = Math.max(l, maxL); 
        }
        return maxL;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  
        System.out.println(sol.lengthOfLongestSubstring(s));
    }
}