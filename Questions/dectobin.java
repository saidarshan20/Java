import java.util.*;

public class dectobin{
    public static void bin(int n){
        int m = n;
        int pow = 0;
        int bine = 0;

        while(n>0){
            int rem = n%2;
            bine = bine + (rem * (int)Math.pow(10,pow));

            pow++;
            n/=2;
        }
        System.out.println("Binary no. of "+m+" = "+bine);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        bin(n);
    }
}