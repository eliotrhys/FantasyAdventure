import Players.*;
import Rooms.Enemy;
import Rooms.SatanicCoffeeShop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Knight testKnight;
    Wizard testWizard;
    Priest testPriest;
    Enemy testEnemy;

    @Before
    public void before(){
        testEnemy = new Enemy("Bearded Hipster", 30, 200);
        testKnight = new Knight("Sir Fucking Cool", 100, Weapon.FLAMETHROWER);
        testWizard = new Wizard("Billy Magic", 40, Creature.PUPPY, 60);
        testPriest = new Priest("Holy Michael The Priest", 70, Potion.BUCKFAST);
    }

}
