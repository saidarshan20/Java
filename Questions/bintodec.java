import java.util.*;

public class bintodec{
    public static void dec(int n){
        int m = n;
        int pow = 0;
        int decm = 0;

        while(n>0){
            int lastdigit = n % 10;
            decm = decm + (lastdigit * (int) Math.pow(2,pow));

            pow++;
            n /= 10;
        }
        System.out.println("decimal no. of "+m+" = "+decm);
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dec(n);
    }
}