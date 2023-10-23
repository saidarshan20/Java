import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void main(String args[]) {
        Integer arr[] = {5,2,4,1,3};
        Arrays.sort(arr,0,4, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}