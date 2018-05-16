package controller;

import models.Constants;
import models.Course;

import java.util.ArrayList;

public class CourseController implements ItemController {
    @Override
    public <T> boolean add(T obj) {
        return obj.getClass().equals(Course.class)
                && store.addCourse((Course)obj);
    }

    @Override
    public <T> boolean update(T obj) {
        return obj.getClass().equals(Course.class)
                && store.updateCourse((Course) obj);
    }

    @Override
    public <T> boolean delete(T obj) {
        return obj.getClass().equals(Course.class)
                && store.deleteCourse((Course) obj);
    }


    public ArrayList<Course> listCourses(int s) {
        switch (s) {
            case Constants.COURSE_ID :
                store.getCourseList().sort(Course.CourseIDComparator);
                break;
            case Constants.COURSE_NAME :
                store.getCourseList().sort(Course.CourseNameComparator);
                break;
            case Constants.LIST_ALL :
                break;
            default :
                break;
        }
        return store.getCourseList();
    }

}
