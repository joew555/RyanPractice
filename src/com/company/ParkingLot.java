package com.company;

import java.util.ArrayList;

/**
 * Created by joe on 6/7/15.
 */
public class ParkingLot {

    public int myCapacity;
    ArrayList<Car> parkedCars = new ArrayList<Car>();


    public ParkingLot(int capacity){

        myCapacity = capacity;

    }

    public ParkingLot(){

    }

    public void parkCar(Car car){

       if (parkedCars.size() < myCapacity){

           if (parkedCars.contains(car)){

               return;

           } else {

               parkedCars.add(car);
               System.out.println("There are " + parkedCars.size() + " in my lot");

               if (parkedCars.size() >= myCapacity) {

                   System.out.println("The lot is full");
               }
           }
       }
    }


}
