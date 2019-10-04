package payroll;


import java.time.LocalDate;

public abstract class Employee implements IPrintable {
    private String name;
    private int age;
    private Vehicle vehicle;
    private double earnings;

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}