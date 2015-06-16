package com.company;

/**
 * Created by joe on 6/7/15.
 */
public class Car {

    public int carYear;
    public String carColor;
    public String carMake;
    public Boolean isRusty;
    public Boolean isEaten = false;


    public Car (int Year, String Color, String Make, Boolean rusty){

        carYear = Year;
        carColor = Color;
        carMake = Make;
        isRusty = rusty;

    }


    public void rememberEatenCars(){

        isEaten = true;
    }

}
