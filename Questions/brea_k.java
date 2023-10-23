import java.util.*;

public class brea_k{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number : ");
            int i = sc.nextInt();

            if(i % 10 == 0){
                break;
            }

            System.out.println("Number is : " + i);

        }

        System.out.println("I'm out of the loop.");
    }
}