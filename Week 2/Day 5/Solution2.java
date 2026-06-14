import java.util.*;
public class Solution2 {
    public int compress(char[] chars) {
        int r = 0, w = 0, count = 0, n = chars.length;
        while(r < n){
            char ch = chars[r];
            count = 0;
            while(r<n && chars[r] == ch){
                r++;
                count++;
            }
            chars[w++] = ch;
            if(count > 1){
                String s = Integer.toString(count);
                for(int i = 0; i < s.length(); i++)
                    chars[w++] = s.charAt(i);
            }
        }
        return w;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of characters:");
        int n = sc.nextInt();
        char[] chars = new char[n];
        System.out.println("Enter the characters:");
        for(int i=0; i<n; i++){
            chars[i] = sc.next().charAt(0);
        }
        int newLength = sol.compress(chars);
        System.out.println("Compressed Length: " + newLength);
        System.out.print("Compressed Characters: ");
        for(int i=0; i<newLength; i++){
            System.out.print(chars[i]);
        }
    }
}