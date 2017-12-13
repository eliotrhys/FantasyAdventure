package Players;

import Rooms.Treasure;

import java.util.ArrayList;

public class Knight extends Melee {


    public Knight(String name, int health, Weapon weapon, ArrayList<Treasure> treasure){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.treasure = treasure;
    }

}
