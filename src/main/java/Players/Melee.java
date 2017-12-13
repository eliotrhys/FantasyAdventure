package Players;

import Rooms.Enemy;

public abstract class Melee extends Player {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public String attack(Enemy enemy){
        int damage = (enemy.getHealthValue() - weapon.getAttackValue());
        enemy.setHealthValue(damage);
        if (enemy.getHealthValue() < 1){
            return enemy.getName() + " is dead!";
        }
        return null;
    }
}
