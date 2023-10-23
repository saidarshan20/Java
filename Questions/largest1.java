import java.util.*;

public class largest1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter First Number : ");
        a = sc.nextInt();

        System.out.println("Enter Second Number : ");
        b = sc.nextInt();

        System.out.println("Enter Third Number : ");
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("First Number is grater which is " + a);
            }
        }
        else if(b>c){
            System.out.println("Second Number is grater which is " + b);
        }
        else{
            System.out.println("Third Number is grater which is " + c);
        }
    } 
}