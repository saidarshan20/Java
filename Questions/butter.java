import java.util.*;

public class butter{
    public static void fly(int n){
        //Outer loop //1st half
        for(int i=1; i<=n; i++){
            //Inner loop //Print i no. of stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //Print Spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            //Print i no.  of stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //Print i no. of stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fly(n);
    }
}