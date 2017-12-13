package Rooms;

import Players.Player;

public class Enemy {

    String name;
    int attackValue;
    int healthValue;

    public Enemy(String name, int attackValue, int healthValue){
        this.name = name;
        this.attackValue = attackValue;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public String attack(Player player, Room room){
        int damage = (player.getHealth() - attackValue);
        player.setHealth(damage);
        if (player.getHealth() < 1) {
            room.removePlayer(player);
            return "You have died.";
        }
        return null;
    }
}
