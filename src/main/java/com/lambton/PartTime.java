package com.lambton;

public class PartTime
{
    private double rate;
    private float hoursWorked;
    public PartTime(String name, int age,float rate,float hoursWorked,Vehicle vehicle){
        super(name,age,vehicle);
        this.rate=rate;
        this.hoursWorked=hoursWorked;
    }

}
