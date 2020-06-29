package com.company;

public class Car {

    private int doors;
    private int noofWheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();

        if(validModel.equals("800") || validModel.equals("alto")) {

            this.model = model;
        }else
            this.model = "unknown";

    }

    public String getModel()
    {
        return this.model;
    }



}
