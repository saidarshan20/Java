public class Constructor {
    public static void main(String args[]) {
        Student S1 = new Student("Saidarshan");
        System.out.println(S1.Name);
    }
}

class Student {
    String Name;
    int Roll;

    Student(String Name) {
        this.Name = Name;
    }
}