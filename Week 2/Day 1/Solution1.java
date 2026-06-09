import java.util.*;
public class Solution1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] counts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        for (int val : counts) {
            if (val != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(sol.isAnagram(s, t));
    }
}