package controller;

import models.Constants;
import models.Instructor;
import models.Student;

import java.util.ArrayList;

public class PersonController implements ItemController{


    @Override
    public <T> boolean add(T obj) {
        if (obj.getClass().equals(Student.class)) {
            return store.addStudent((Student) obj);
        } else if (obj.getClass().equals(Instructor.class)) {
            return store.addInstructor((Instructor) obj);
        }
        return false;
    }

    @Override
        public <T> boolean update(T obj){
            if (obj.getClass().equals(Student.class)) {
                return store.updateStudent((Student) obj);
            } else if (obj.getClass().equals(Instructor.class)) {
                return store.updateInstructor((Instructor) obj);
            }
            return false;
        }


    @Override
    public <T> boolean delete(T obj) {
        if (obj.getClass().equals(Student.class)) {
            return store.deleteStudent((Student) obj);
        } else if (obj.getClass().equals(Instructor.class)) {
            return store.deleteInstructor((Instructor) obj);
        }
        return false;
    }


    public ArrayList<Student> listStudents(int type) {
            switch (type) {
                case Constants.NAME :
                    store.getStudentList().sort(Student.NameComparator);
                    break;
                case Constants.SURNAME :
                    store.getStudentList().sort(Student.SurnameComparator);
                    break;
                case Constants.STUDENT_ID :
                    store.getStudentList().sort(Student.StudentIDComparator);
                    break;
                case Constants.DEPARTMENT :
                    store.getStudentList().sort(Student.DepartmentComparator);
                    break;
                case Constants.LIST_ALL:
                    break;
                default :
                    break;
            }
        return store.getStudentList();
    }

    public ArrayList<Instructor> listInstructors(int type) {
            switch (type) {
                case Constants.NAME :
                    store.getInstructorList().sort(Instructor.NameComparator);
                    break;
                case Constants.SURNAME :
                    store.getInstructorList().sort(Instructor.SurnameComparator);
                    break;
                case Constants.TITLE :
                    store.getInstructorList().sort(Instructor.TitleComparator);
                    break;
                case Constants.DEPARTMENT :
                    store.getInstructorList().sort(Instructor.DepartmentComparator);
                    break;
                case Constants.LIST_ALL :
                    break;
                default :
                    break;
            }
            return store.getInstructorList();
    }


 }
