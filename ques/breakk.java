import java.util.*;

public class breakk {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int nums = sc.nextInt();
            if (nums % 10 == 0) {
                break;
            } else {
                System.out.println(nums);
            }
        }
    }
}