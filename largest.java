import java.util.*;

public class largest{
    public static void find(int n,int arr[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>large){
                large = arr[i];
            }
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Largest number is : " + large);
        System.out.println("Smallest number is : " + small);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter arrays : ");
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        find(n,num);
    }
}