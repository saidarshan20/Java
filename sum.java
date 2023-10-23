import java.util.*;
public class sum{
    public static void main(String args[]){
        /*int a = 2;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);*/

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number A is ");
        int a = sc.nextInt();

        System.out.println("Number B is ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum is ");
        System.out.println(sum);
    }
}