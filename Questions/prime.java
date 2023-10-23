import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("N is prime");
        } else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){  //here i write i<= Math.sqrt(n) which means squre root of n which takes less time then i<n.
                if(n % i == 0){
                isPrime = false;
                }
            }
            if(isPrime == true){
            System.out.print("N is prime");
             } else {
            System.out.print("N is not prime");
            }
        }
    }
}