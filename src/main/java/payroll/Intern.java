package payroll;

public class Intern {
    private String schoolName;
    private double earnings;
    private Vehicle vehicle;
    public Vehicle getVehicle() {
        return vehicle;
    }


    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Intern(String name, int age, String schoolName,Vehicle vehicle) {
        super(name, age, vehicle);
        this.schoolName = schoolName;

    }
    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }


}
