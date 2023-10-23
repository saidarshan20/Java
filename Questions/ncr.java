import java.util.*;

public class ncr{
    public static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static int ncr_1(int n, int r){
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);

        return (a/(b*c));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n,r;

        n=sc.nextInt();
        r=sc.nextInt();

        System.out.println(ncr_1(n , r));
    }
}