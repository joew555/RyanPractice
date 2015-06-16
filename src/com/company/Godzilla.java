package com.company;

/**
 * Created by joe on 6/10/15.
 */
public class Godzilla extends Monster{

    public Godzilla(int appetite, int health) {

        super(appetite, health);

    }



    public void eatLot(ParkingLot lot){


        super.eatCarsFromLot(lot);
    }

    public void stomp(Monster monster){

        for (Car c : monster.allCarsEaten){

            if (c.isRusty == true){

                System.out.println("Godzilla can't attack!");
                return;
            }
        }

        for (Car c : super.allCarsEaten) {

            if (monster.monsterHealth <= 0) {

            System.out.println("Godzilla has killed Mothra!");
            } else { monster.monsterHealth = monster.monsterHealth - 500;


                    }

            }

        }



    }






