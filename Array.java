import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter your array size : ");
        n = sc.nextInt();
        int marks [] = new int [n];
        System.out.println("Enter your marks : ");
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        System.out.print("Your marks are : ");
        for(int i=0; i<n; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        int percentage = 0;
        int totalmark = 0;
        for(int i=0; i<n; i++){
            totalmark = totalmark + marks[i];
        }
        percentage = percentage + (totalmark)/3;
        System.out.println("Your percentage is : " + percentage + "%");
        System.out.println("Length of Array is : " + marks.length);
        /*String fruits [] = {'Apple', 'Orange', 'Bananna'};
        System.out.println(fruits);*/
    }
}