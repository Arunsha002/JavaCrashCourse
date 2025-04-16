package Encapsulation;

class Arun {
    private int age = 25;

    void showAge() {
        System.out.println("Arun's Age: " + age);
    }
}


class School {
    int age = 100;
}

public class Schooldetails {
    public static void main(String[] args) {

        School sch1 = new School();
        System.out.println("School Age: " + sch1.age);

        Arun arun = new Arun();
        arun.showAge();

        Student student = new Student();
        student.showStudentAge();  // includes teacher's age via inheritance
    }
}
