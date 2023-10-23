import java.util.*;

public class flip2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int revers = 0;

        while(num > 0) {
            revers = (revers * 10) + num % 10;
            num /= 10;
        }
        System.out.println(revers);
    }
}