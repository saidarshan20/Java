//IMPORTANT

public class kadans{
    public static void maxsub(int arr[]){
        int max = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i=0; i<arr.length; i++){
            currsum = currsum + arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            max = Math.max(currsum, max);
        }
        System.out.println("Maximum subarray sum is : " + max);
    }
    public static void main(String args[]){
        //int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        int numbers[] = {-2,-3,4,-1,-2,-1,5,3};
        maxsub(numbers);
    }
}