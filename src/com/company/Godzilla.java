package com.company;

/**
 * Created by joe on 6/10/15.
 */
public class Godzilla extends Monster{

    public Godzilla(int appetite, int health) {

        super(appetite, health);

    }


    public void stomp(Monster monster){
        if (monster.isInvincible()){

            System.out.println("Godzilla cannot attack");
            return;
        }

        for (Car c : allCarsEaten) {

            if (monster.monsterHealth <= 0) {

            System.out.println("Godzilla has killed Mothra!");
            } else { monster.monsterHealth = monster.monsterHealth - 500;


                    }

            }

        }



    }






