import java.util.*;
public class Solution2 {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] winFreq = new int[26];
        int n = s1.length(), m = s2.length(), i;
        if(n>m)
            return false;
        for(i=0; i<n; i++){
            freq[s1.charAt(i) - 'a']++;
            winFreq[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq, winFreq))
            return true;
        for(i=n; i< m; i++){
            winFreq[s2.charAt(i)-'a']++;
            winFreq[s2.charAt(i-n) - 'a']--;
            if(Arrays.equals(freq, winFreq))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();  
        String s2 = sc.nextLine();  
        System.out.println(sol.checkInclusion(s1, s2));
    }
}