import java.util.*;

public class pair{
    public static void pair( int arr[]){
        int tp = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
               System.out.print("(" + curr + "," + arr[j] +  ")" );
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are : " + tp);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
 
        int ar[] = {2,5,7,8,9};//new int[n];

        /*for(int i=1; i<=ar.length; i++){
            ar[i] = sc.nextInt();
        }*/

        pair(ar);
    }
}