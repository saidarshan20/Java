public class Parameterized {
    public static void main(String args[]) {
        Student S1 = new Student("Saidarshan");
    }
}

class Student {
    String Name;
    int Roll;

    Student(String Name) {
        this.Name = Name;
    }
}