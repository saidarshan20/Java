import java.util.*;

public class para {
    public static int calculate(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate(a,b);
        System.out.println(sum);
    }
}