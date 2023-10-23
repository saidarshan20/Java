public class diagonalsum {
    public static int Diagonal_Sum(int mat[][]) {
        //Brutefroce method
        int sum = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<=mat[0].length; j++) {
                if(i == j) {
                    sum += mat[i][j];
                } else if(i+j == mat.length-1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println("Sum is : "+sum);
        //Linear way
        int sum1 = 0;
        for(int i=0; i<mat.length; i++) {
            //Primary diagonal
            sum1 += mat[i][i];
            //Secondary daigonal
            if(i != mat.length-1-i) {
                sum1 += mat[i][mat.length-1-i];
            }
        }
        return sum1;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println(Diagonal_Sum(matrix));
    }
}