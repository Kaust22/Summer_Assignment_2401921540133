import java.util.*;
public class Solution1 {
    public boolean isPalindrome(String s) {
        StringBuilder news = new StringBuilder("");
        int n = s.length(), i, j;
        for(i = 0; i<n; i++){
            char ch = s.charAt(i);
            ch  = Character.toLowerCase(ch);
            if(Character.isLetterOrDigit(ch))
                news.append(ch);
        }
        i=0;
        j=news.length() - 1;
        while(i<j){
            if(news.charAt(i) == news.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println(s.isPalindrome(str));
    }
}