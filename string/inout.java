import java.util.*;

public class inout {
    public static void pritnletter(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
            //System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = new String("xyz@ji94");
        //String Name = sc.nextLine();
        String Name = new String("Tony Stark");
        System.out.println(Name);
        System.out.println(Name.length());
        pritnletter(str);
    }
}