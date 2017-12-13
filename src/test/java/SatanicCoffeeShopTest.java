import Players.*;
import Rooms.Enemy;
import Rooms.SatanicCoffeeShop;
import Rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SatanicCoffeeShopTest {

    Enemy testEnemy;
    Enemy testEnemy2;
    Treasure testTreasure;
    SatanicCoffeeShop testSatanicCoffeeShop;
    SatanicCoffeeShop testSatanicCoffeeShop2;
    ArrayList<Player> testPlayers;
    Knight testKnight;
    Wizard testWizard;
    Priest testPriest;


    @Before
    public void before(){
        testEnemy = new Enemy("Bearded Hipster", 30, 200);
        testEnemy2 = new Enemy("Spabs", 1, 30);
        testTreasure = new Treasure("The Golden Macbook");
        testPlayers = new ArrayList<>();
        testKnight = new Knight("Sir Fucking Cool", 100, Weapon.FLAMETHROWER, new ArrayList<>());
        testWizard = new Wizard("Billy Magic", 40, Creature.PUPPY, 60);
        testPriest = new Priest("Holy Michael The Priest", 70, Potion.BUCKFAST);
        testPlayers.add(testKnight);
        testPlayers.add(testWizard);
        testPlayers.add(testPriest);
        testSatanicCoffeeShop = new SatanicCoffeeShop(testPlayers, testEnemy, testTreasure);
        testSatanicCoffeeShop2 = new SatanicCoffeeShop(testPlayers, testEnemy2, testTreasure);
    }

    @Test
    public void roomHasEnemy(){
        assertEquals(testSatanicCoffeeShop.getEnemy().getName(), "Bearded Hipster");
    }

    @Test
    public void roomHasPlayers(){
        assertEquals(testSatanicCoffeeShop.playerCount(), 3);
    }

    @Test
    public void roomHasTreasure(){
        assertEquals(testSatanicCoffeeShop.getTreasure().getName(), "The Golden Macbook");
    }

    @Test
    public void canDie(){
        testEnemy.attack(testKnight, testSatanicCoffeeShop);
        testEnemy.attack(testKnight, testSatanicCoffeeShop);
        testEnemy.attack(testKnight, testSatanicCoffeeShop);
        testEnemy.attack(testKnight, testSatanicCoffeeShop);
        assertEquals(testEnemy.attack(testKnight, testSatanicCoffeeShop), "You have died.");
        assertEquals(testSatanicCoffeeShop.playerCount(), 2);
    }

    @Test
    public void canCauseDamage(){
        testEnemy.attack(testKnight, testSatanicCoffeeShop);
        assertEquals(testKnight.getHealth(), 70);
        testEnemy.attack(testPriest, testSatanicCoffeeShop);
        assertEquals(testPriest.getHealth(), 40);
        testEnemy.attack(testWizard, testSatanicCoffeeShop);
        assertEquals(testWizard.getHealth(), 30);
    }

    @Test
    public void canKillEnemy(){
        testKnight.attack(testEnemy2);
        testKnight.attack(testEnemy2);
        assertEquals(testKnight.attack(testEnemy2), "Spabs is dead!");
    }

    @Test
    public void canGetTreasure(){
        testKnight.getTreasure(testTreasure);
        assertEquals(testKnight.countTreasure(), 1);

    }
}
