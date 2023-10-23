import java.util.*;

public class sumfunction{
    public static int sum(int num1, int num2){//here int num1,num2 are parameter or formal parameter.
        int s = num1+num2;
        return s;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

       // int sum = 

        System.out.println(sum(a,b));////here int a,b are arguments or actual parameter.
    }
}