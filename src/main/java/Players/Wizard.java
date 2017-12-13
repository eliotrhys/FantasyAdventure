package Players;

public class Wizard extends Magic {

    int fireball;

    public Wizard(String name, int fireball, Creature creature, int health){
        this.name = name;
        this.fireball = fireball;
        this.creature = creature;
        this.health = health;
    }

    public int getFireball() {
        return fireball;
    }

    public void attack()
}
