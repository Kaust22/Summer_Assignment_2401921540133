import java.util.*;
public class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int freq[] = new int[26];
        StringBuilder s1 = new StringBuilder("");
        for(String s : strs){
            Arrays.fill(freq, 0);
            for(int i = 0; i< s.length(); i++){
                freq[s.charAt(i) - 'a']++;
            }
            s1.setLength(0);
            for (int i = 0; i < 26; i++) {
                s1.append(freq[i]).append('#');
            }
            String s2 = s1.toString();
            if(!map.containsKey(s2)){
                map.put(s2, new ArrayList<>());
            }
            map.get(s2).add(s);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for(int i=0; i<n; i++){
            strs[i] = sc.next();
        }
        List<List<String>> result = sol.groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + result);
    }
}