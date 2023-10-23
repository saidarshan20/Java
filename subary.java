import java.util.*;

public class subary{
    public static void printsub(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ts = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                    sum = sum+arr[k];
                }
                if(sum > max){
                    max = sum;
                } 
                if(sum < min){
                    min = sum;
                }
                System.out.println();
                System.out.println("Sum is :" + sum);
                sum = 0;
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
        System.out.println("Total numbers of sub arrrays are : " + ts);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int numbers[] = {2,5,6,8,9};

        printsub(numbers);
    }
}