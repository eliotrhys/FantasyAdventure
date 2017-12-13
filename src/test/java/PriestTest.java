import Players.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PriestTest {

    Priest testPriest;
    Knight testKnight;
    Wizard testWizard;


    @Before
    public void before(){
        testPriest = new Priest("Holy Michael The Priest", 70, Potion.BUCKFAST);
        testKnight = new Knight("Sir Fucking Cool", 100, Weapon.FLAMETHROWER, new ArrayList<>());
        testWizard = new Wizard("Billy Magic", 40, Creature.PUPPY, 60);
    }

    @Test
    public void canGetPotion(){
        assertEquals(testPriest.getPotion(), Potion.BUCKFAST);
    }

    @Test
    public void priestHasName(){
        assertEquals(testPriest.getName(), "Holy Michael The Priest");
    }

    @Test
    public void canHealPlayers(){
        testPriest.heal(testKnight);
        testPriest.heal(testWizard);
        assertEquals(testKnight.getHealth(), 110);
        assertEquals(testWizard.getHealth(), 70);
    }

}
