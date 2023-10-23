import java.util.*;

public class initialization {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       // String name = sc.next();//it only take a single word means after space it cannot take anything.
        String fullName = sc.nextLine();//it will take whole sentance.

       // System.out.println(name);
        System.out.println(fullName);
        System.out.println("Length of String is : "+fullName.length());

        String firstName = "Saidarshan";
        String lastName = "Sahu";
        String FullName = firstName+" "+lastName;
        System.out.println("My fullname is "+FullName);
    }
}