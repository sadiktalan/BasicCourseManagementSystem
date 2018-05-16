package models;

import java.util.Comparator;

public class Student extends Person {

    private int studentId;

    public Student(int studentId,String name,String surname, String birthday, String department) {
        this.studentId = studentId;
        this.setName(name);
        this.setSurname(surname);
        this.setBirthday(birthday);
        this.setDepartment(department);
    }

    int getStudentId() {
        return studentId;
    }
    public static Comparator<Student> StudentIDComparator = Comparator.comparingInt(Student::getStudentId);

    @Override
    public String toString() {
        return
                "[" + studentId + "," +
                getName() + "," +
                getSurname() + "," +
                getBirthday() + "," +
                getDepartment() + "]";
    }
}
