import java.util.*;

public class ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adult : Drive,Vote.");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}