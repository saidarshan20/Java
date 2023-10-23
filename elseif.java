import java.util.*;

public class elseif{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adult : Drive, Vote.");
        }
        else if(age >= 13 && age < 18){
            System.out.println("Teenager.");
        }
        else{
            System.out.println("Not adult and teenager also.");
        }
    }
}