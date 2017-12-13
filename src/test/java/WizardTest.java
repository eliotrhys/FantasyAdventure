import Players.Creature;
import Players.Wizard;
import Rooms.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard testWizard;
    Enemy testEnemy;

    @Before
    public void before(){
        testWizard = new Wizard("Billy Magic", 40, Creature.PUPPY, 60);
        testEnemy = new Enemy("Evil Duck", 20, 40);
    }

    @Test
    public void canGetCreature(){
        assertEquals(Creature.PUPPY,  testWizard.getCreature());
    }

    @Test
    public void wizardHasName(){
        assertEquals(testWizard.getName(), "Billy Magic");
    }

    @Test
    public void canAttackEnemy(){
        testWizard.attack(testEnemy);
        assertEquals(testEnemy.getHealthValue(), 0);
    }



}
