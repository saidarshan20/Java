import java.util.*;

public class product{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number A is ");
        int a = sc.nextInt();

        System.out.println("Number B is ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Product is ");
        System.out.println(product);
    }
}