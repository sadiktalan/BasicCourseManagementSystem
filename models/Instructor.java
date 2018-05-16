package models;

import java.util.Comparator;

public class Instructor extends Person {
    private String title;

    public Instructor(String title,String name,String surname, String birthday, String department) {
        this.title = title;
        this.setName(name);
        this.setSurname(surname);
        this.setBirthday(birthday);
        this.setDepartment(department);
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public static Comparator<Instructor> TitleComparator = Comparator.comparing(Instructor::getTitle);

    @Override
    public String toString() {
        return "{" + title + "," +
                getName() + "," +
                getSurname() + "," +
                getBirthday() + "," +
                getDepartment() + "]";
    }
}

