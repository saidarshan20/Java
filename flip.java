import java.util.*;

public class flip {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int flipNum = 0;

        while(n > 0) {
            flipNum = n % 10;
            System.out.print(flipNum);
            n = n / 10;
        }
    }
}