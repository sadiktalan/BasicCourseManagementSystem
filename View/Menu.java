package View;

import controller.CourseController;
import controller.PersonController;
import models.Course;
import models.Instructor;
import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static CourseController courseController= new CourseController();
    private static PersonController personController = new PersonController();

    public void run() {
        System.out.println("WELCOME THE COURSE MANAGEMENT SYSTEM");
        System.out.println("Please select the operation:");
        System.out.println("1-ADDING ITEM");
        System.out.println("2-UPDATING ITEM");
        System.out.println("3-DELETING ITEM");
        System.out.println("4-LISTING ITEMS");

        Scanner s = new Scanner(System.in);
        int choice = Integer.parseInt(s.next());

        switch (choice) {
            case 1 :
                add();
                break;
            case 2 :
                update();
                break;
            case 3 :
                delete();
                break;
            case 4 :
                list();
                break;
            default :
                run();
                break;
        }
        run();
    }

    private void add(){
        System.out.println("Please choose what to add :");
        System.out.println("1-Add Student");
        System.out.println("2-Add Instructor");
        System.out.println("3-Add Course");
        Scanner s = new Scanner(System.in);
        int choice2 = Integer.parseInt(s.next());
        switch (choice2) {
            case 1 :
                addStudent();
                break;
            case 2 :
                addInstructor();
                break;
            case 3 :
                addCourse();
                break;
            default :
                add();
                break;
        }
    }

    private void update() {
        System.out.println("Please choose what to update :");
        System.out.println("1-Update Student");
        System.out.println("2-Update Instructor");
        System.out.println("3-Update Course");
        Scanner s = new Scanner(System.in);
        int choice2 = Integer.parseInt(s.next());
        switch (choice2) {
            case 1 :
                updateStudent();
                break;
            case 2 :
                updateInstructor();
                break;
            case 3 :
                updateCourse();
                break;
            default :
                run();
                break;
        }
    }

    private void delete() {
        System.out.println("Please choose what to delete :");
        System.out.println("1-Delete Student");
        System.out.println("2-Delete Instructor");
        System.out.println("3-Delete Course");

        Scanner s = new Scanner(System.in);
        int choice2 = Integer.parseInt(s.next());
        switch (choice2) {
            case 1 :
                deleteStudent();
                break;
            case 2 :
                deleteInstructor();
                break;
            case 3 :
                deleteCourse();
                break;
            default :
                delete();
                break;
        }
    }

    private void list() {
        System.out.println("Please choose what to list :");
        System.out.println("1-List Student");
        System.out.println("2-List Instructor");
        System.out.println("3-List Course");
        Scanner s = new Scanner(System.in);
        int choice2 = Integer.parseInt(s.next());
        switch (choice2) {
            case 1 :
                listStudent();
                break;
            case 2 :
                listInstructor();
                break;
            case 3 :
                listCourse();
                break;
            default :
                list();
                break;
        }
    }

    private void addStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student's Id : ");
        int id = Integer.parseInt(s.nextLine());
        System.out.println("Enter Student's name :");
        String name = s.nextLine();
        System.out.println("Enter Student's surname");
        String surname = s.nextLine();
        System.out.println("Enter day of the birth :");
        String day = s.nextLine();
        System.out.println("Enter month of the birth :");
        String month = s.nextLine();
        System.out.println("Enter year of the birth :");
        String year = s.nextLine();
        System.out.println("Enter student's department : ");
        String department = s.nextLine();
        Student st = new Student(id,name,surname,day+"-"+month+"-"+year,department);
        System.out.println(personController.add(st));
    }

    private void addInstructor() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Instructor's Title : ");
        String title = s.nextLine();
        System.out.println("Enter Instructor's name :");
        String name = s.nextLine();
        System.out.println("Enter Instructor's surname");
        String surname = s.nextLine();
        System.out.println("Enter day of the birth :");
        String day = s.nextLine();
        System.out.println("Enter month of the birth :");
        String month = s.nextLine();
        System.out.println("Enter year of the birth :");
        String year = s.nextLine();
        System.out.println("Enter instructor's department : ");
        String department = s.nextLine();
        Instructor ins = new Instructor(title,name,surname,day+"-"+month+"-"+year,department);
        System.out.println(personController.add(ins));
    }

    private void addCourse() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter course's id :");
        String id = s.nextLine();
        System.out.println("Enter course's name :");
        String name = s.nextLine();
        Course c = new Course(id,name);
        System.out.println(courseController.add(c));

    }

    private void updateStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the Student's id :");
        int id = Integer.parseInt(s.nextLine());
        System.out.println("Update Student's name :");
        String name = s.nextLine();
        System.out.println("Update Student's surname");
        String surname = s.nextLine();
        System.out.println("Update day of the birth :");
        String day = s.nextLine();
        System.out.println("Update month of the birth :");
        String month = s.nextLine();
        System.out.println("Update year of the birth :");
        String year = s.nextLine();
        System.out.println("Update student's department : ");
        String department = s.nextLine();
        Student st = new Student(id,name,surname,day+"-"+month+"-"+year,department);
        System.out.println(personController.update(st));

    }

    private void updateInstructor() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Instructor's Title : ");
        String title = s.nextLine();
        System.out.println("Update Instructor's name :");
        String name = s.nextLine();
        System.out.println("Update Instructor's surname");
        String surname = s.nextLine();
        System.out.println("Update day of the birth :");
        String day = s.nextLine();
        System.out.println("Update month of the birth :");
        String month = s.nextLine();
        System.out.println("Update year of the birth :");
        String year = s.nextLine();
        System.out.println("Update instructor's department : ");
        String department = s.nextLine();
        Instructor ins = new Instructor(title,name,surname,day+"-"+month+"-"+year,department);
        System.out.println(personController.update(ins));
    }

    private void updateCourse() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter course's id :");
        String id = s.nextLine();
        System.out.println("Update course's name :");
        String name = s.nextLine();
        Course c = new Course(id,name);
        System.out.println(courseController.update(c));
    }

    private void deleteStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student's Id :");
        int id = Integer.parseInt(s.nextLine());
        System.out.println(personController.delete(new Student(id,null,null,null,null)));

    }

    private void deleteInstructor() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Instructor's Title : ");
        String title = s.nextLine();
        System.out.println("Update Instructor's name :");
        String name = s.nextLine();
        System.out.println("Update Instructor's surname");
        String surname = s.nextLine();
        System.out.println(personController.delete(new Instructor(title,name,surname,null,null)));
    }

    private void deleteCourse() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Course's Id :");
        String id = s.nextLine();
        System.out.println(courseController.delete(new Course(id,null)));
    }

    private void listStudent() {
        System.out.println("Please choose how to list");
        System.out.println("1-Student Id");
        System.out.println("2-Name");
        System.out.println("3-Surname");
        System.out.println("4-Department");
        System.out.println("5-List All");
        Scanner s = new Scanner(System.in);
        int choice2 = Integer.parseInt(s.nextLine());
        int choiceToSelect;
        switch (choice2) {
            case 1 :
                choiceToSelect = 6;
                break;
            case 2 :
                choiceToSelect = 1;
                break;
            case 3 :
                choiceToSelect = 2;
                break;
            case 4 :
                choiceToSelect = 4;
                break;
            case 5 :
                choiceToSelect = 9;
                break;
            default :
                choiceToSelect = 9;
                break;
        }
        printStudents(personController.listStudents(choiceToSelect));;
    }

    private void listInstructor() {
        System.out.println("Please choose how to list");
        System.out.println("1-Title");
        System.out.println("2-Name");
        System.out.println("3-Surname");
        System.out.println("4-Department");
        System.out.println("5-List All");
        Scanner s = new Scanner(System.in);
        int choice2 = Integer.parseInt(s.nextLine());
        int choiceToSelect;
        switch (choice2) {
            case 1 :
                choiceToSelect = 5;
                break;
            case 2 :
                choiceToSelect = 1;
                break;
            case 3 :
                choiceToSelect = 2;
                break;
            case 4 :
                choiceToSelect = 4;
                break;
            case 5 :
                choiceToSelect = 9;
                break;
            default :
                choiceToSelect = 9;
                break;
        }
        printInstructors(personController.listInstructors(choiceToSelect));
    }

    private void listCourse() {
        System.out.println("Please choose how to list");
        System.out.println("1-Course Id");
        System.out.println("2-Course Name");
        Scanner s = new Scanner(System.in);
        int choice2 = Integer.parseInt(s.nextLine());
        int choiceToSelect;
        switch (choice2) {
            case 1 :
                choiceToSelect = 7;
                break;
            case 2 :
                choiceToSelect = 8;
                break;
            default :
                choiceToSelect = 9;
                break;
        }
        printCourses(courseController.listCourses(choiceToSelect));
    }

    private void printStudents(ArrayList<Student> students) {
        System.out.println("Student List");
        students.forEach(student -> System.out.println(student.toString()));
        System.out.println("---------------");
    }
    private void printInstructors(ArrayList<Instructor> instructors) {
        System.out.println("Instructor List");
        instructors.forEach(instructor -> System.out.println(instructor.toString()));
        System.out.println("---------------");
    }

    private void printCourses(ArrayList<Course> courses) {
        System.out.println("Course List");
        courses.forEach(course -> System.out.println(course.toString()));
        System.out.println("---------------");
    }
}
