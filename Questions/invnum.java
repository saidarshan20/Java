import java.util.*;

public class invnum{
    public static void number(int n){
        int cou = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(cou+" ");
                cou++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        number(n);
    }
}