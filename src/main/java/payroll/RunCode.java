package payroll;

public class RunCode {
    public static double totalPayroll = 0;

    public static void main(String[] args) {

        Motorcycle bike = new Motorcycle("Kawasaki", "Red", "Deep", 3000.0);
        Car car1= new Car("Challenger","Black","CAMY",43000.0,"6");
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Harman", 1994, 40.0f,10.0f, 40,bike);

    }
}