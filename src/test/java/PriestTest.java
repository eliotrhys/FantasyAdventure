import Players.Potion;
import Players.Priest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriestTest {

    Priest testPriest;

    @Before
    public void before(){
        testPriest = new Priest("Holy Michael The Priest", 70, Potion.BUCKFAST);
    }

    @Test
    public void canGetPotion(){
        assertEquals(testPriest.getPotion(), Potion.BUCKFAST);
    }

    @Test
    public void priestHasName(){
        assertEquals(testPriest.getName(), "Holy Michael The Priest");
    }

}
