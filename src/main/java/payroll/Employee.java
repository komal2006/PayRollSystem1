package payroll;


import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private int age;
    private Vehicle vehicle;
    private double earnings;

    public Employee(String name, int age, Vehicle vehicle) {
        this.name=name;
        this.age=calcBirthYear(age);
        setVehicle(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}


