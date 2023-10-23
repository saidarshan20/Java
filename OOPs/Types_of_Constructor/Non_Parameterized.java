public class Non_Parameterized {
    public static void main(String args[]) {
        Student S1 = new Student();
    }
}

class Student {
    String Name;
    int Roll;

    Student() {
        System.out.println("Constructor is called....");
    }
}