package com.lambton;
public class FixedBasedPartTime extends PartTime {

    private double fixedAmount;
    private Vehicle vehicle;

    FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount,Vehicle vehicle) {
        super(name, age, rate, hoursWorked, vehicle);
        this.fixedAmount=fixedAmount;

    }


}
