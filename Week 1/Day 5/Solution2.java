import java.util.Arrays;
public class Solution2 {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}