import java.util.*;

public class tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you yearly income : ");
        int income = sc.nextInt();

        int tax;

        if(income >= 1000000){
            tax = (int) (0.3 * income);
            System.out.println("You have to give 30% of tax and your tax is " + tax + ".");
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int) (0.2 * income);
            System.out.println("You have to give 20% of tax and your tax is " + tax + ".");
        }
        else{
            System.out.println("You don't need to pay income tax.");
        }
    }
}