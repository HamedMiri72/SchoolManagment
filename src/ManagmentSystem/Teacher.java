package ManagmentSystem;

/*
thia class is responsible for kepping track of teacherss name and salary and id.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }








}
