public class argu_array{
    public static void update(int mark[], int unchange){
        unchange = 10;
        for(int i=0; i<mark.length; i++){
            mark[i] = mark[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {98,89,69};
        int unchange = 5;
        update(marks, unchange);

        System.out.println(unchange);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    } 
}