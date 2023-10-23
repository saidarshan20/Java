import java.util.*;

public class product{
    public static int multi(int num1, int num2){
        int m = num1*num2;
        return m;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multi(a,b));
    }
}