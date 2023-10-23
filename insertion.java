public class insertion{
    public static void printf(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion_sort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev +1] = arr[curr];
        }
    }

    public static void main(String args[]) {
        int arr[] = {5,2,3,4,1};
        insertion_sort(arr);
        printf(arr);
    }
}