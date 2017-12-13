import Players.Creature;
import Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard testWizard;

    @Before
    public void before(){
        testWizard = new Wizard("Billy Magic", 40, Creature.PUPPY, 60);
    }

    @Test
    public void canGetCreature(){
        assertEquals(Creature.PUPPY,  testWizard.getCreature());
    }

    @Test
    public void wizardHasName(){
        assertEquals(testWizard.getName(), "Billy Magic");
    }

}
