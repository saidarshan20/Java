public class spiralmat {
    public static void print_Spiral(int mat[][]) {
        int startRow = 0;
        int endRow = mat.length-1;
        int startClm = 0;
        int endClm = mat[0].length-1;

        while(startRow <= endRow && startClm <= endClm) {
            //Top
            for(int j=startClm; j<=endClm; j++) {
                System.out.print(mat[startRow][j]+" ");
            }
            
            //Right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(mat[i][endClm]+" ");
            }

            //Lower
            for(int j=endClm-1; j>=startClm; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(mat[endRow][j]+" ");
            }

            //Left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startClm == endClm) {
                    break;
                }
                System.out.print(mat[i][startClm]+" ");
            }
            startRow++;
            endRow--;
            startClm++;
            endClm--;
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15},
                          {16,17,18,19,20}};
        print_Spiral(matrix);
    }
}