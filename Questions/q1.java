import java.util.*;

public class q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        System.out.println("A is ");
        a = sc.nextInt();
        System.out.println("B is ");
        b = sc.nextInt();
        System.out.println("C is ");
        c = sc.nextInt();

        int avg = (a + b + c) / 3;
        System.out.println("Average is ");
        System.out.println(avg);
    }
}