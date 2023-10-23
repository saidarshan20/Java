public class charat {
    public static void char_at(String name) {
        for(int i=0; i<name.length(); i++) {
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String args[]) {
        String firstName = "Saidarshan";
        String lastName = "Sahu";
        String FullName = firstName+" "+lastName;
        System.out.println("My fullname is "+FullName);
        char_at(FullName);
    }
}