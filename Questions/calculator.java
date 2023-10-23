import java.util.*;

public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("Enter first number : ");
        a = sc.nextInt();

        System.out.println("Enter second number : ");
        b = sc.nextInt();

        System.out.println("Choose any operator from 👇 these : ");
        System.out.println("+ , - , * , / , %");
        //String ope = sc.next();
        char ope = sc.next().charAt(0);

        switch(ope){
            case '+' : System.out.println(a+b);
                    break;
            case '-' : System.out.println(a-b);
                    break;
            case '*' : System.out.println(a*b);
                    break;
            case '/' : System.out.println(a/b);
                    break;
            case '%' : System.out.println(a%b);
                    break;
            default : System.out.println("Please select properly.");
        }
    }
}