import java.util.*;

public class switch1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        switch(num){
            case 5 : System.out.println("Samosa");
                    break;
            case 6 : System.out.println("Burger");
                    break;
            case 7 : System.out.println("Mango shake");
                    break;
            default : System.out.println("Jaa na l@wd*");
        }
    }
}