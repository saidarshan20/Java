import java.util.*;

public class binarysearch{
    public static int find(int n, int arr[], int key){
        int start = 0, end = n-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            } else if (arr[mid] > key){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n , key;
        System.out.println("Enter size of array : ");
        n = sc.nextInt();

        int numb[] = new int[n];
        System.out.println("Enter your arrays : ");
        for(int i=0; i<n; i++){
            numb[i] = sc.nextInt();
        }

        System.out.println("Enter the key you want to search : ");
        key = sc.nextInt();

        int result = find(n, numb, key);

        if(result == -1){
            System.out.println("NOT found");
        } else {
            System.out.println("Found on : " + result);
        }
    }
}