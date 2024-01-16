public class Student extends Person{
    public int matriculation;
    private double grade;

    Student(String name, String phone, String email, int id, double grade) {
        super(name, phone, email);
        this.grade = grade;
        this.matriculation = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    private boolean subscribeToModule(){
        // shows if student is subscribed to module
        // code here:

        // placeholder to prevent error message
        return true;
    }
}
