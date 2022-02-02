package com.company;

public class GroundCar extends  Transport{

    private String GroundType;

    public GroundCar(double volume, String model, CarColor carColor, String groundType) {
        super(volume, model, carColor);
        GroundType = groundType;
    }


    public String getGroundType() {
        return GroundType;
    }


    final public void signal(){
        System.out.println("Бип бип");
    }

    public void signal(String signal){
        System.out.println(signal);
    }

    @Override
    public String printInfo() {
        return super.printInfo()+"\nТип машины: "+getGroundType();
    }
}
