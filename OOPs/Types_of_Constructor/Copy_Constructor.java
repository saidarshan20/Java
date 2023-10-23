public class Copy_Constructor {
    public static void main(String args[]) {
        Student S1 = new Student("Saidarshan");
        Student S2 = new Student(1210229);
        System.out.println(S1.Name);
        System.out.println(S1.Roll);
    }
}

class Student {
    String Name;
    int Roll;

    Student(String Name) {
        this.Name = Name;
    }

    Student(int Roll) {
        this.Roll = Roll;
    }
}