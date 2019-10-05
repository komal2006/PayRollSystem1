package com.lambton;
public class FixedBasedPartTime extends PartTime {

    private double fixedAmount;
    private Vehicle vehicle;

    FixedBasedPartTime(String name, int age, float rate, float hoursWorked, double fixedAmount,Vehicle vehicle) {
        super(name, age, rate, hoursWorked, vehicle);
        this.fixedAmount=fixedAmount;

    }
    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
    @Override
    public double calcEarnings(){
        return (getRate() * getHoursWorked()) + getFixedAmount();


    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }


}
