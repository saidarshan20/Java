import java.util.*;

public class invstar{
    public static void inst(int n){
        //For rows
        for(int i=1; i<=n; i++){
            //For spaces
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //int row = sc.nextInt();
        inst(4); 
    }
}