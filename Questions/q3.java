import java.util.*;

public class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float a, b, c;
        System.out.println("Enter the price of pencil ");
        a = sc.nextFloat();

        System.out.println("Enter the price of pen  ");
        b = sc.nextFloat();

        System.out.println("Enter the price of eraser ");
        c = sc.nextFloat();

        float bill = (float) (a + b + c);
        float fl = (float) (0.18 * bill);
        float bill2 = bill + fl;
        System.out.println("Your bill is ");
        System.out.println(bill2);
    }
}