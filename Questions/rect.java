import java.util.*;

public class rect{
    public static void rec(int row, int col){
        //for rows
        for(int i=1; i<=row; i++){
            //for columns
            for(int j=1; j<=col; j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();
        rec(row,col);
    }
}