import java.util.*;
public class Solution3 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i;
        int available[] = new int[26];
        for(i=0; i< magazine.length(); i++){
            available[magazine.charAt(i)-'a']++;
        }
        for(i=0; i < ransomNote.length(); i++){
            available[ransomNote.charAt(i)-'a']--;
        }
        for(i=0; i< available.length; i++){
            if(available[i] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransom note:");
        String ransomNote = sc.nextLine();
        System.out.println("Enter the magazine:");
        String magazine = sc.nextLine();
        System.out.println(sol.canConstruct(ransomNote, magazine));
    }
}