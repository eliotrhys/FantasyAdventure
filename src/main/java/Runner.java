import Players.*;
import Rooms.Enemy;
import Rooms.SatanicCoffeeShop;
import Rooms.Treasure;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    Game game;

    public Runner(Game game){
        this.game = game;
    }

    public static void main(String[] args) {
        Game game = new Game();
        Runner runner = new Runner(game);
        runner.run();
    }


    public void run(){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("*** WELCOME TO THE SATANIC COFFEE SHOP ***");
        System.out.println("*** FIGHT ME IF YOU DARE ***");
        System.out.println("Do you wish to fight?");
        System.out.println("Answer YES or NO");
        String input = scanner.nextLine().toUpperCase();
        if (input.equals("YES"))
        {
            System.out.println("*** LETS FIGHT ***");
        }
        else
        {
            System.out.println("*** TOO BAD ***");
        }

        System.out.println("You're fighting!");
    }

}
