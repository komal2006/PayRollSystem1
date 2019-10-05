package payroll;

public class RunCode {
    public static double totalPayroll = 0;

    public static void main(String[] args) {

        Motorcycle bike = new Motorcycle("Kawasaki", "Red", "Deep", 3000.0);
        Car car1= new Car("Challenger","Black","CAMY",43000.0,"6");
        CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Harman", 1994, 40.0f,10.0f, 40,bike);
        FixedBasedPartTime fixedBased=new FixedBasedPartTime("Charan",1993,20.0f,9.0f,300,null);
        Intern intern=new Intern("Varinder",1994,"Cambrian College",car1);





    }
}