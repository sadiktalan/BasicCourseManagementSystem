package models;

import java.util.ArrayList;

public class Store {

    private static Store getInstance = new Store();
    public static Store getInstance() {return getInstance;}

    private  ArrayList<Student> studentList= new ArrayList<>();
    private  ArrayList<Instructor> instructorList= new ArrayList<>();
    private ArrayList<Course> courseList= new ArrayList<>();

    private Store() {
    }

    public boolean addStudent(Student s) {
        if(studentList.contains(s)){
            return false;
        }
        studentList.add(s);
        return true;
    }
    public boolean addInstructor(Instructor i) {
        if(instructorList.contains(i)) {
            return false;
        }
        instructorList.add(i);
        return true;
    }

    public boolean addCourse(Course c) {
        if (courseList.contains(c)) {
            return false;
        }
        courseList.add(c);
        return true;
    }
    public boolean updateStudent(Student s) {
        boolean isFound = false;
        for(Student student : studentList) {
            if(student.getStudentId() == s.getStudentId()) {
                student.setName(s.getName());
                student.setSurname(s.getSurname());
                student.setBirthday(s.getBirthday());
                student.setDepartment(s.getDepartment());
                isFound = true;
                break;
            }
        }
        return isFound;
    }
    public boolean updateInstructor(Instructor ins) {
        boolean isFound = false;
        for(Instructor instructor : instructorList) {
            if(instructor.getName().equals(ins.getName()) && instructor.getSurname().equals(ins.getSurname())){
                instructor.setTitle(ins.getTitle());
                instructor.setBirthday(ins.getBirthday());
                instructor.setDepartment(ins.getDepartment());
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public boolean updateCourse(Course c) {
        boolean isFound = false;
        for (Course course : courseList) {
            if (course.getCourseId().equals(c.getCourseId())) {
                course.setCourseName(c.getCourseName());
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public boolean deleteStudent(Student s) {
        boolean isDeleted = false;
        int index = -1;
        for(Student student : studentList) {
            if(student.getStudentId() == s.getStudentId()) {
               index = studentList.indexOf(student);
            }
        }
        if(index != -1) {
            studentList.remove(index);
            isDeleted = true;
        }
        return isDeleted;
    }

    public boolean deleteInstructor(Instructor i) {
        int index = -1;
        boolean isDeleted = false;
        for(Instructor instructor : instructorList) {
            if(instructor.getTitle().equals(i.getTitle())
                    && instructor.getName().equals(i.getName())
                    && instructor.getSurname().equals(i.getSurname())) {
                index = instructorList.indexOf(instructor);
            }
        }
        if(index != -1) {
            instructorList.remove(index);
            isDeleted = true;
        }
        return isDeleted;
    }

    public boolean deleteCourse(Course c) {
        int index = -1;
        boolean isDeleted = false;
        for(Course course : courseList) {
            if(course.getCourseId().equals(c.getCourseId())){
                index = courseList.indexOf(course);
            }
        }
        if(index != -1) {
            courseList.remove(index);
            isDeleted = true;
        }
        return isDeleted;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Instructor> getInstructorList() {
        return instructorList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}
