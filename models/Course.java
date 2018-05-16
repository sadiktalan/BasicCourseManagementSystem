package models;

import java.util.Comparator;

public class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    String getCourseId() {
        return courseId;
    }

    String getCourseName() {
        return courseName;
    }

    void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static Comparator<Course> CourseIDComparator = Comparator.comparing(Course::getCourseId);

    public static Comparator<Course> CourseNameComparator = Comparator.comparing(Course::getCourseName);

    @Override
    public String toString() {
        return "[" +  courseId + "," +
                courseName  + "]";
    }
}
