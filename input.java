import java.util.*;

public class input{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        /*System.out.println("First name ");
        String name = s.next();
        System.out.println(name); //For single word */

        System.out.println("Full name ");
        String name1 = s.nextLine();
        System.out.println(name1);  //For next line or after space also

        System.out.println("First Number ");
        int in = s.nextInt();
        System.out.println(in);

        System.out.println("Float ");
        float fl = s.nextFloat();
        System.out.println(fl);
    }
}