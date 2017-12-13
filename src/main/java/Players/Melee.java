package Players;

import Rooms.Enemy;

public abstract class Melee extends Player {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void attack(Enemy enemy){
        int damage = (enemy.getHealthValue() - weapon.getAttackValue());
        enemy.setHealthValue(damage);
    }
}
