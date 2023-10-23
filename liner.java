import java.util.*;

public class liner{
    public static int liner(int n, int number[], int key){
        for(int i=0; i<n; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        int key;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int numbers[] = new int[n];

        System.out.println("Enter your values to store in an array : ");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search : ");
        key = sc.nextInt();

        int store = liner(n,numbers,key);

        if(store == -1){
            System.out.println("NOT Found");
        } else {
            System.out.println("Found on : " + store);
        }
    }
}