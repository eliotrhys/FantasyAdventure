package Players;

import Rooms.Enemy;

public abstract class Healer extends Player{

    Potion potion;

    public Potion getPotion() {
        return potion;
    }

    public void heal(Player player){
        int health = (player.getHealth() + potion.getHealingValue());
        player.setHealth(health);
    }

    public String attack(Enemy enemy){
        return null;
    }

}
