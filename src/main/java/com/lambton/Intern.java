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

    @Override
    public String printMyData() {
        return this.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + getName() + "\n" + "Age: " + getAge() + "\n");
        stringBuilder.append("Employee is an Intern")
                .append("\n -School name: " + getSchoolName())
                .append("\n -Earnings: " + calcEarnings()+ "\n");
        checkVehicle(stringBuilder);
        return String.valueOf(stringBuilder);
    }


    private void checkVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Employee has no vehicle registerd");
        } else if (vehicle instanceof Car) {
            stringBuilder.append("Employee has a Car\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Distance Travelled: ").append(((Car)getVehicle()).getDistanceTravelled())
                    .append("\n -Capacity: ").append(((Car)getVehicle()).getCapacity());

        } else if (vehicle instanceof Motorcycle) {
            stringBuilder.append("Employee has a MotorCycle\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Distance Travelled: ").append(((Motorcycle)getVehicle()).getDistanceTravelled())
            ;
        }
    }


    public Intern(String schoolName, double earnings, Vehicle vehicle) {
        this.schoolName = schoolName;
        this.earnings = earnings;
        this.vehicle = vehicle;
    }
}
