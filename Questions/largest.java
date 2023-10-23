import java.util.*;

public class largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter Second Numner : ");
        int b = sc.nextInt();

        if(a >= b){
            System.out.println("First Number is grater which is " + a);
        }
        else{
            System.out.println("Second Number is grater which is " + b);
        }
    }
}