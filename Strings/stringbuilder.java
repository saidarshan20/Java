public class stringbuilder {
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("Sai ")
        for(char i='a'; i<='z'; i++) {
            str.append(i);
        }
        System.out.println(str); //to convert StringBuilder to string we just have to write /*str.toString*/.
    }
}