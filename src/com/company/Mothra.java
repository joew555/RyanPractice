package com.company;

/**
 * Created by joe on 6/10/15.
 */
public class Mothra extends Monster {
    public Mothra(int appetite, int health) {
        super(appetite, health);
    }


    public void talons(Monster monster) {

        for (Car c : allCarsEaten) {

            if (monster.monsterHealth > 0) {

                System.out.println("Mothra has killed Godzilla!");
            } else {
                monster.monsterHealth = monster.monsterHealth - 1000;


            }

        }


    }

    public boolean isInvincible(){

        for (Car c : allCarsEaten){
            if (c.isRusty == true){

                return true;
            }
        }

        return false;
    }


}


