package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        GroundCar groundCar = new GroundCar(1.5,"БМВ",CarColor.WHITE,"Легковая");
        System.out.println(groundCar.printInfo());
        groundCar.signal();

        PassengerCar Fit = new PassengerCar(1.3, " Хонда Фит", CarColor.GRAY," Таксовая", Region.randomRegion());
        System.out.println(Fit.printInfo());
        Fit.signal("эээээу уком");

        PassengerCar tiko = new PassengerCar("Тиикоо",0.5,CarColor.RED,"Машина для магаза", Region.randomRegion());
        System.out.println(tiko.printInfo());
        tiko.signal("Кач пешеходтооон!!");

    }
}
