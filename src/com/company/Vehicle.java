package com.company;

public abstract class Vehicle {
    private String model;
    private int yearOfIssue;
    private  TypeofEngine typeOfEngine;

    public Vehicle(String model, int yearOfIssue, TypeofEngine typeOfEngine) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.typeOfEngine = typeOfEngine;
    }

    public Vehicle(){}


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        if(yearOfIssue>2022){
            throw new InvalidYearException( yearOfIssue + "ж Бул машина чыга элек!");
        }
        else if(yearOfIssue<1922){
            throw new InvalidYearException( yearOfIssue +"  Машина 100 жылдан чоң экен");
        }
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public TypeofEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeofEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}
