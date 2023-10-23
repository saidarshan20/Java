import java.util.*;

public class ternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an element : ");
        int a = sc.nextInt();

        String variable = ((a%2)==0)? "Even" : "Odd";
        System.out.println(variable);
    }
}