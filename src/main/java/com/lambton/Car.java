package com.lambton;

public class Car extends Vehicle {

    private Double distanceTravelled;
    private String capacity;
    public Car(String make, String color, String plate, Double distanceTravelled, String capacity) {
        super(make, color, plate);
        this.distanceTravelled=distanceTravelled;
        this.capacity=capacity;

    }

}
