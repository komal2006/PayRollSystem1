package com.lambton;

public class FixedBasedPartTime
{
    double fixedAmount ;
    double totalEarnings;
    public FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }


}
