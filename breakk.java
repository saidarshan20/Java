public class breakk {
    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nI am out of the loop");
    }
}