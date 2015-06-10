package com.company;

/**
 * Created by joe on 6/7/15.
 */
public class Car {

    public int carYear;
    public String carColor;
    public String carMake;
    public Boolean isEaten = false;

    public Car (int Year, String Color, String Make){

        carYear = Year;
        carColor = Color;
        carMake = Make;

    }


    public void rememberEatenCars(){

        isEaten = true;
    }

}
