package com.company;

public class Car2 {

    private int yearModel;
    private String make;
    private int speed;


    public Car2(int year, String carMake)
    {
        yearModel= year;
        make=carMake;
        speed=0;

    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        speed = speed;
    }

    public void accelerateSpeed(int speed){
       speed =speed+10;
    }
    public void slowSpeed(int speed){
        speed= speed-10;
    }
}
