import java.util.*;

public class revers{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    /* while(n > 0){
        int lastdigit = n % 10;
        System.out.print(lastdigit);
        n = n/10;
     } */

    int rev = 0;
    while(n > 0){
        int lastdigit = n % 10;
        rev = (rev * 10) + lastdigit;
        n = n / 10;
    }

    System.out.println(rev);

    }
}