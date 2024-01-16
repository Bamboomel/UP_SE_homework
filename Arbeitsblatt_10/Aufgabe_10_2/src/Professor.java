public class Professor extends Person{
    private double income;

    Professor(String name, String phone, String email, double income) {
        super(name, phone, email);
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

}
