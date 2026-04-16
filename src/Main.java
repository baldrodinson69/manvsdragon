import java.util.Scanner;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        PrintStatus.start();
        int hpInput = scanner.nextInt();
        int dmgInput = scanner.nextInt();
        Hero player = new Hero(hpInput, dmgInput);
        scanner.nextLine();


        startGame(player, scanner);


    }

    public static void startGame(Hero player, Scanner scanner) {
        Dungeon dungeon = new Dungeon();

        // Create the roster of enemies
        Dragon[] dragons = {
                new Dragon("Ignis", 100, 20, "Fire"),
                new Dragon("Banshee", 100, 20, "Screeching"),
                new Dragon("Venom", 100, 20, "Poison")
        };

        boolean playing = true;

        System.out.println("\n" + Art.GREEN + "Welcome to the Dungeon. Find the exit (E)!" + Art.RESET);

        // --- THE MASTER GAME LOOP ---
        while (playing && player.getHP() > 0) {
            dungeon.printDungeon();
            System.out.print("Move (W/A/S/D): ");
            String move = scanner.nextLine();

            // Check what tile we stepped on
            char tile = dungeon.movePlayer(move);

            // Trigger events based on the tile type
            if (tile == 'R' || tile == 'B' || tile == 'Y') {
                System.out.println("\n" + Art.RED + "!!! A DRAGON BLOCKS YOUR PATH !!!" + Art.RESET);

                // Jump into the BattleEngine
                BattleEngine engine = new BattleEngine(player, dragons);
                engine.run();

                // After battle, check if player died
                if (player.getHP() <= 0) {
                    System.out.println(Art.RED + "You have fallen in battle..." + Art.RESET);
                    playing = false;
                }
            } else if (tile == 'E') {
                System.out.println(Art.YELLOW + "VICTORY! You escaped the maze!" + Art.RESET);
                playing = false;
            }
        }
    }
}