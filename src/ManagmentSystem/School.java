package ManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher> teachers;
    private String name;
    private List<Student> students;
    private int totalMonetEarned;
    private int totalMonySpend;


    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMonetEarned() {
        return totalMonetEarned;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student student) {
        students.add(student);
    }

    public void updatedTotalMonetEarned(int MoneyEarned) {
        totalMonetEarned += MoneyEarned;
    }

    public void updateTotalMonySpend(int moneySpend) {
        totalMonetEarned -= moneySpend;
    }

    public int getTotalMonySpend() {
        return totalMonySpend;
    }
}
