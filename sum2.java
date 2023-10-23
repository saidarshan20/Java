import java.util.*;

public class sum2{
    public static void sum(int n){
        int sum = 0;
        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sum(n);
    }
}