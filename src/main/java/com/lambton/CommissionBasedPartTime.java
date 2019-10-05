package com.lambton;

public class CommissionBasedPartTime {

    private double commissionPerc;
    private Vehicle vehicle;

    public double getCommissionPerc() {
        return commissionPerc;
    }


    public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, double commissionPerc,Vehicle vehicle) {
        super(name, age, rate, hoursWorked, vehicle);
        setcommissionPerc(commissionPerc);
    }

    public void setCommissionPerc(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
