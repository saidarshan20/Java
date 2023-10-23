import java.util.*;

public class inout {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Length is " + marks.length);

        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            System.out.println(marks[i]);
        }

        int percentage = 0;

        for(int i=0; i<n; i++) {
            percentage += marks[i];
        }

        System.out.println("Percentage is " + percentage/n + "%");
    }
}