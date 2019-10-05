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
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + getName() + "\n" + "Age: " + getAge() + "\n");

        stringBuilder.append("Employee is PartTime\\Fixed Amount")
                .append("\n -Rate: " + getRate())
                .append("\n -Hours Worked: " + getHoursWorked())
                .append("\n -Fixed amount: " + getFixedAmount())
                .append("\n -Earnings: " + calcEarnings())
                .append("(" + getHoursWorked() * getRate() + " + " + getFixedAmount()+")"+"\n");
        checkVehicle(stringBuilder);
        return String.valueOf(stringBuilder);
    }


}
