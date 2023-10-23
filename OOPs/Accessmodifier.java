public class Accessmodifier {
    public static void main(String args[]) {
        BankAcc myAcc = new BankAcc();
        myAcc.UserName = "Saidarshan";
        myAcc.setPassword("abcdefghijkl");
    }
}

class BankAcc {
    public String UserName;
    private String Password;
    public void setPassword(String newPassword) {
        Password = newPassword;
    }
}