import java.util.*;

public class range{
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
                //break;
            }
        }
        return true;
    }
    public static void range(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
            System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        range(n);
    }
}