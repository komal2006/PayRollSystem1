package com.lambton;

public class Intern
{
    private String schoolName;
    private double earnings;
    private Vehicle vehicle;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Intern(String schoolName, double earnings, Vehicle vehicle) {
        this.schoolName = schoolName;
        this.earnings = earnings;
        this.vehicle = vehicle;
    }
}
