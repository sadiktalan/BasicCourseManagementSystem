package models;

import java.util.Comparator;

class Person {
    private String name;
    private String surname;
    private String birthday;
    private String department;

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getBirthday() {
        return birthday;
    }

    String getDepartment() {
        return department;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    void setDepartment(String department) {
        this.department = department;
    }
    public static Comparator<Person> NameComparator = Comparator.comparing(Person::getName);
    public static Comparator<Person> SurnameComparator = Comparator.comparing(Person::getSurname);
    public static Comparator<Person> DepartmentComparator = Comparator.comparing(Person::getDepartment);
}
