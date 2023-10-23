public class bubble{
    public static void printf(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int swap = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                if(swap < 0){
                    break;
                }
            }
        }
        //return arr;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        bubble_sort(arr);
        printf(arr);
    }
}