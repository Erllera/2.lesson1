package com.company;

final public class PassengerCar extends GroundCar{

    private int region = Region.randomRegion();



    public PassengerCar(double volume, String model, CarColor carColor, String groundType, int region) {
        super(volume, model, carColor, groundType);
    }

    public PassengerCar(String model,double volume,  CarColor carColor, String groundType, int region) {
        super(volume, model, carColor, groundType);
    }


    @Override
    public void signal(String signal) {
        super.signal("Уйди с дороги! "+signal);
    }

    @Override
    public String printInfo() {
        return super.printInfo()+"\nРегион: "+region;
    }
}
