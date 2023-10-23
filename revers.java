import java.util.*;

public class revers{
    public static void arr(int n, int ar[]){
        int first = 0, end = n-1;

        while(first <= end){

            int temp = ar[end];  //There is no swap() functions available like c++.
            ar[end] = ar[first];
            ar[first] = temp;

            first++;
            end--;
        }
        for(int i=0; i<n; i++){
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arr(n,arr);
    }
}