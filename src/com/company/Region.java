package com.company;

import java.util.Random;

public class Region {


    public static int randomRegion(){
        Random random = new Random();
        return random.nextInt(7)+1;
    }


}
