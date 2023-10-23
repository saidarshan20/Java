import java.util.*;

public class average{
    public static void ave(int a, int b, int c){
        int aveg = (a+b+c) / 3;
        System.out.println("Average is "+aveg);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        ave(a,b,c);
    }
}