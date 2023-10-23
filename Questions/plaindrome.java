import java.util.*;

public class plaindrome{
    public static void pd(int n){
        int palindrome = n;
        int reverse = 0;
        while(palindrome!=0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;
        }
        if(reverse == n){
            System.out.println("It's a plaindrome.");
        }
        else{
            System.out.println("It's not.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pd(n);
    }
}