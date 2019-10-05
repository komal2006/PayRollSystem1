package com.lambton;


    public class FullTime extends Employee {
        private double salary;
        private double bonus;
        private Vehicle vehicle;

        public FullTime(String name, int age, double salary,double bonus,Vehicle vehicle) {
            super(name, age,vehicle);
            this.salary=salary;
            this.bonus=bonus;
            setVehicle(vehicle);
        }


        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }
    }
