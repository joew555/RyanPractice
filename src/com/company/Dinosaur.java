package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Dinosaur {

    private int i;
    private int numCarsEaten = 0;
    ArrayList<Car> allCarsEaten = new ArrayList<Car>();
    ArrayList<Car> matchedCars = new ArrayList<Car>();
    private String preferredMake;
    private Car carFromLot;


    public Dinosaur(String makesILike){

        preferredMake = makesILike;

    }


    public void eatCar(Car car){



        if (car.isEaten == false){

            System.out.println("Yum, I ate a " + car.carYear + car.carColor + car.carMake);
            car.rememberEatenCars();
            trackNumCarsEaten();
            allCarsEaten.add(car);
            System.out.println("I have eaten " + numCarsEaten + " cars");
            getAllCars();


        } else {

            System.out.println("I can't eat this car");
        }
    }

    public void eatCars(ArrayList<Car> cars){

        for (Car c : cars){

            eatCar(c);

        }

    }




    public void trackNumCarsEaten(){

        numCarsEaten = numCarsEaten + 1;
    }

    public void getAllCars(){

        for (int i = 0; i < allCarsEaten.size(); i++){

            System.out.println("I have eaten a " + allCarsEaten.get(i).carYear +
                    allCarsEaten.get(i).carColor + allCarsEaten.get(i).carMake);
        }
    }

    public void eatCarsFromLot(ParkingLot lot){

        for (Car c : lot.parkedCars) {

            if (c.carMake == preferredMake){

                matchedCars.add(c);

            }

        }

        eatCars(matchedCars);
        lot.parkedCars.removeAll(matchedCars);




    }


}

//        Iterator<Car> iterator = lot.parkedCars.iterator();
//            while (iterator.hasNext()) {
//
//               if (iterator.next().carMake == preferredMake){
//
//                   carFromLot = iterator.next();
//                   eatCar(carFromLot);
//                   iterator.remove();
//
//               }
//
//            }
