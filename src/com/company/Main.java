package com.company;


import java.io.Console;

/*
    Create a Car class with a constructor that takes a name and year and color

    Create a Dinosaur class that has one method
    The method signature should look like this public void EatCar(Car car)
    EatCar should simply log out the name, year, and color of the car.

    EC: Create a property on the car to keep track of whether it has already been eaten.
    If it's already been eaten, log something like "I can't eat that",
    and then return early from the function with the return command


    dinosaur should be able to eat cars in parking lot, but only ones that it likes
    when eaten, must be removed from parking lot and added to dinosaur

 */
public class Main {

    public static void main(String[] args){

        Car car1 = new Car(2015, "Black", "Mini");
        Car car2 = new Car(2012, "red","VW");
        Car car3 = new Car(2014, "green", "Subaru");
        Car car4 = new Car(2016, "gray", "Mini");



        ParkingLot lot1 = new ParkingLot(4);
        lot1.parkCar(car1);
        lot1.parkCar(car2);
        lot1.parkCar(car3);
        lot1.parkCar(car4);

        Dinosaur myDinosaur = new Dinosaur("Mini");
       // myDinosaur.eatCar(car1);
        //myDinosaur.eatCar(car1);
        //myDinosaur.eatCar(car2);
        //myDinosaur.eatCar(car3);

       //myDinosaur.eatCarsFromLot(lot1);
        myDinosaur.eatCarsFromLot(lot1);




    }



}
