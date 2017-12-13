import Players.Knight;
import Players.Weapon;
import Rooms.Enemy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight testKnight;
    Enemy testEnemy;

    @Before
    public void before(){
        testKnight = new Knight("Sir Fucking Cool", 100, Weapon.FLAMETHROWER, new ArrayList<>());
        testEnemy = new Enemy("Evil Duck", 20, 40);
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.FLAMETHROWER, testKnight.getWeapon());
    }

    @Test
    public void knightHasName(){
        assertEquals(testKnight.getName(), "Sir Fucking Cool");
    }

    @Test
    public void knightHasFullHealth(){
        assertEquals(testKnight.getHealth(), 100);
    }

    @Test
    public void knightCanAttackEnemy(){
        testKnight.attack(testEnemy);
        assertEquals(testEnemy.getHealthValue(), 30);
    }


}
