package Encapsulation;

import com.lao.inheritance.Teacher;

public class Student extends Teacher {
    protected int studentAge = 18;

    public void showStudentAge() {
        System.out.println("Student's Age: " + studentAge);

        // Accessing inherited protected method and variable from another package
        System.out.println("Accessing teacher's age from subclass: " + teacherAge);
        displayTeacherAge();
    }
}
