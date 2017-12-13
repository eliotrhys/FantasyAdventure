import Players.*;
import Rooms.Enemy;
import Rooms.SatanicCoffeeShop;
import Rooms.Treasure;

import java.util.ArrayList;

public class Game {

    Enemy beardedHipster;
    Treasure goldenMacbook;
    ArrayList<Player> playersArray;
    Knight sirFuckingCool;
    Wizard billyMagic;
    Priest fatherMichael;
    SatanicCoffeeShop satanicCoffeeShop;

    public Game(){
        beardedHipster = new Enemy("Bearded Hipster", 30, 200);
        goldenMacbook = new Treasure("The Golden Macbook");
        playersArray = new ArrayList<>();
        sirFuckingCool = new Knight("Sir Fucking Cool", 100, Weapon.FLAMETHROWER, new ArrayList<>());
        billyMagic = new Wizard("Billy Magic", 40, Creature.PUPPY, 60);
        fatherMichael = new Priest("Holy Michael The Priest", 70, Potion.BUCKFAST);
        playersArray.add(sirFuckingCool);
        playersArray.add(billyMagic);
        playersArray.add(fatherMichael);
        satanicCoffeeShop = new SatanicCoffeeShop(playersArray, beardedHipster, goldenMacbook);
    }

    public void fight(ArrayList playersArray, Enemy enemy){
        for (Player randomPlayer : playersArray){
            randomPlayer.attack(enemy);
        }
    }

}
