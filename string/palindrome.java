import java.util.*;

public class palindrome {
    public static boolean check(String str) {
        int n = str.length();
        for(int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = new String("jhgfj");
        System.out.println(check(str));
    }
}