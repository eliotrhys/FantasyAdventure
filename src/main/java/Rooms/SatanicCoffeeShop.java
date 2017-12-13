package Rooms;

import Players.Player;

import java.util.ArrayList;

public class SatanicCoffeeShop extends Room {

    public SatanicCoffeeShop(ArrayList<Player> players, Enemy enemy, Treasure treasure){

        this.players = players;
        this.enemy = enemy;
        this.treasure = treasure;
    }
}
