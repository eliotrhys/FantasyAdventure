package Players;

public abstract class Healer extends Player{

    Potion potion;

    public Potion getPotion() {
        return potion;
    }

    public void heal(Player player){
        int health = (player.getHealth() + potion.getHealingValue());
        player.setHealth(health);
    }

}
