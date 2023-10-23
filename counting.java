public class counting {
    public static void printf(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void counting_sort(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<n; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<n; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            } 
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1,5,3,1,2,3};
        counting_sort(numbers);
        printf(numbers);
    }
}