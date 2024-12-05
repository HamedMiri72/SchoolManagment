package ManagmentSystem;

/**
 * created by hamed miri
 * this class is responsible for keeping the track of student.
 * fees, names, grade & fees paid
 *
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To Create new student object by initializing new values.
     * Fees for every student is $3000
     * Fees paid initially is 0.
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade){

        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 3000;
    }

    // we are not going to alter student name and student id.

    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Add the fees to the fees paid.
     * the school is going to receive th fees.
     * @param fees
     */
    public void updateFeesPaid(int fees){
        feesPaid += fees;
    }

    public void setFeesTotal(int feesTotal){
        this.feesTotal = feesTotal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }
}
