import java.util.*;
public class Solution3 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
        int n = p.length(), m = s.length(), i;
        if(n>m)
            return ls;
        int freq[] = new int[26];
        int winFreq[] = new int[26];
        for(i=0; i<n; i++){
            freq[p.charAt(i) - 'a']++;
            winFreq[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq, winFreq))
            ls.add(0);
        for(i=n; i < m; i++){
            winFreq[s.charAt(i)-'a']++;
            winFreq[s.charAt(i-n)-'a']--;
            if(Arrays.equals(freq, winFreq))
                ls.add(i-n+1);
        }
        return ls;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  
        String p = sc.nextLine();  
        System.out.println(sol.findAnagrams(s, p));
    }
}