import java.util.*;

public class passfail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your EXAM score : ");
        float score = sc.nextFloat();

        String what = (score >= 33) ? "Pass" : "Fail" ;
        System.out.println(what);
    }
}