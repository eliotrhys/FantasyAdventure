package Rooms;

import Players.Player;

import java.util.ArrayList;

public abstract class Room {
    ArrayList<Player> players;
    Enemy enemy;
    Treasure treasure;

    public Enemy getEnemy() {
        return enemy;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public int playerCount(){
        return players.size();
    }

    public void removePlayer(Player player){
        players.remove(player);
    }
}
