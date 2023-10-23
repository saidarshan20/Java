import java.util.*;

public class creation {
    public static boolean find(int a[][], int key) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++) {
                if(a[i][j] == key) {
                    System.out.println("Key found on ("+i+","+j+") cell");
                    return true;
                }
            }
        }
        return false;
    }

    public static void small_large(int arr[][]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n=arr.length, m = arr[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(min > arr[i][j]) {
                    min = arr[i][j];
                } if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Largest is : " + max);
        System.out.println("Smallest is : " + min);
    } 

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n=matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        find(matrix, 4);
        small_large(matrix);
    }
}