import Players.*;
import Rooms.Enemy;
import Rooms.SatanicCoffeeShop;
import Rooms.Treasure;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    Enemy beardedHipster;
    Treasure goldenMacbook;
    ArrayList<Player> playersArray;
    Knight sirFuckingCool;
    Wizard billyMagic;
    Priest fatherMichael;
    SatanicCoffeeShop satanicCoffeeShop;

    public Runner(){
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


    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run();
    }


    public void run(){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("*** WELCOME TO THE SATANIC COFFEE SHOP ***");
        System.out.println("*** FIGHT ME IF YOU DARE ***");
        System.out.println("Do you wish to fight?");
        System.out.println("Answer YES or NO");
        String input = scanner.nextLine().toUpperCase();
        if (input.equals("YES"))
        {
            System.out.println("*** LETS FIGHT ***");
        }
        else
        {
            System.out.println("*** TOO BAD ***");
        }

        System.out.println("You're fighting!");
    }

}
