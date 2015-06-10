package com.company;

/**
 * Created by joe on 6/10/15.
 */
public class Mothra extends Monster {

    String wingColor;


    public Mothra(String makesILike, String colorOfWings) {

        super(makesILike);
        wingColor = colorOfWings;

    }

    public void eatCar(Car car){

        if (wingColor == car.carColor){

            super.eatCar(car);
        }
    }

}