package Players;

import Rooms.Treasure;

import java.util.ArrayList;

public abstract class Player {

    String name;
    int health;
    ArrayList<Treasure> treasure;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void getTreasure(Treasure treasure) {
        this.treasure.add(treasure);
    }

    public int countTreasure() {
        return this.treasure.size();
    }
}
