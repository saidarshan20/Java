import java.util.*;

public class continu_e{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number : ");
            int i = sc.nextInt();

            if(i % 10 == 0){
                continue;
            }

            System.out.println("Number is : " + i);

        }

    }

}