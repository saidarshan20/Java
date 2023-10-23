public class subary2{
    public static void maxsum(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int prefixary [] = new int[arr.length];
        prefixary[0] = arr[0];
        for(int i=1; i<prefixary.length; i++){
            prefixary[i] = prefixary[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            curr = 0;
            for(int j=i; j<arr.length; j++){
                curr = i==0 ? prefixary[j] : prefixary[j] - prefixary[i-1];
                if(curr > max){
                    max = curr;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int ar[] = {1,-2,6,-1,3};
        maxsum(ar);
    }
}