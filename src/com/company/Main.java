package com.company;


/*
    Create a Car class with a constructor that takes a name and year and color

    Create a Monster class that has one method
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

        Car car1 = new Car(2015, "Black", "Mini", false);
        Car car2 = new Car(2012, "red","VW", false);
        Car car3 = new Car(2014, "green", "Subaru", true);
        Car car4 = new Car(2016, "gray", "Mini", false);
        Car car5 = new Car(2015, "gray", "Mini", false);
        Car car6 = new Car(2014, "gray", "VW", false);
        Car car7 = new Car(2013, "red", "VW", false);


        ParkingLot lot1 = new ParkingLot(4);
        ParkingLot lot2 = new ParkingLot(3);
        lot1.parkCar(car1);
        lot1.parkCar(car2);
        lot1.parkCar(car3);
        lot1.parkCar(car4);
        lot2.parkCar(car5);
        lot2.parkCar(car6);
        lot2.parkCar(car7);

        //Monster myMonster = new Monster("Mini");
        Mothra myMothra = new Mothra(3,2000);
        Godzilla myGodzilla = new Godzilla(4,1000);
       // myMonster.eatCar(car1);
        //myMonster.eatCar(car1);
        //myMonster.eatCar(car2);
        //myMonster.eatCar(car3);

       //myMonster.eatCarsFromLot(lot1);
        //myMonster.eatCarsFromLot(lot1);
        myGodzilla.eatCarsFromLot(lot2);
        myMothra.eatCarsFromLot(lot1);

        myGodzilla.stomp(myMothra);
        myMothra.talons(myGodzilla);



    }



}
