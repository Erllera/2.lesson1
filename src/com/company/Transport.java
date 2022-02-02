package com.company;

public class Transport {

    private double volume;
    private String model;
    private CarColor carColor;

    public CarColor getCarColor() {
        return carColor;
    }

    public Transport(double volume, String model, CarColor carColor) {
        this.volume = volume;
        this.model = model;
        this.carColor = carColor;
    }

    public double getVolume() {
        return volume;
    }

    public String getModel() {
        return model;
    }

    public String printInfo() {
        return "\nМодель: " + model +"\nОбъём: "+ volume + "\nЦвет: "+ carColor;
    }

}
