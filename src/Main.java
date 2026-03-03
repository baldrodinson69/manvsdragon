import java.util.Scanner;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(
                "  ********************  \n" +
                        " **The final battle!!** \n" +
                        " ********************** ");

        System.out.println();
        String splashscreen = "";
        System.out.println(splashscreen);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hero hit points ");
        int heroHP = scanner.nextInt();
        System.out.println("Enter Hero damage points ");
        int heroDamage = scanner.nextInt();

        System.out.println("Hero has " + heroHP + " HP and deals " + heroDamage + " points of damage");

        int dragon1HP = 100;
        int dragon1Damage = 20;
        int dragon2HP = 100;
        int dragon2Damage = 20;
        int dragon3HP = 100;
        int dragon3Damage = 20;


        //do battle until one side dies
        boolean heroWins = false;
        while (true) {

            System.out.println("Hero has " + heroHP + " HP and deals " + heroDamage + " points of damage");
            System.out.println("-----------------------------------------");
            System.out.println("Dragons Status");
            System.out.println("---------------");
            System.out.println("Dragon 1 has " + dragon1HP + " HP and deals " + dragon1Damage + " points of damage");
            System.out.println("Dragon 2 has " + dragon2HP + " HP and deals " + dragon2Damage + " points of damage");
            System.out.println("Dragon 3 has " + dragon3HP + " HP and deals " + dragon3Damage + " points of damage");
            System.out.println();

            if (heroHP < 1) {
                heroWins = false;
                break;
            }
            if (dragon1HP < 1 && dragon2HP < 1 && dragon3HP < 1) {
                heroWins = true;
            }

            int dragonChoice = 0;
            while (dragonChoice < 1 || dragonChoice > 3) {

                System.out.println("Hero's turn to attack. Which dragon would you like to attack (1, 2, 3)?");
                dragonChoice = scanner.nextInt();

                System.out.println("Attacking Dragon " + dragonChoice + ".");

                if (dragonChoice == 1) {
                    if (dragon1HP < 1) {
                        System.out.println("Dragon 1 is already dead!");
                    }else {
                        int heroHitsForDmg = random.nextInt(heroDamage);
                        dragon1HP = dragon1HP - heroHitsForDmg;
                        System.out.println("You hit Dragon 1 for " + heroHitsForDmg + " dmg.");
                    }

                } else if (dragonChoice == 2) {
                    if (dragon2HP < 1) {
                        System.out.println("Dragon 2 is already dead!");
                    }else {
                        int heroHitsForDmg = random.nextInt(heroDamage);
                        dragon2HP = dragon2HP - heroHitsForDmg;
                        System.out.println("You hit Dragon 2 for " + heroHitsForDmg + " dmg.");
                    }
                } else if (dragonChoice == 3) {
                    if (dragon3HP < 1) {
                        System.out.println("Dragon 3 is already dead!");
                    }else {
                        int heroHitsForDmg = random.nextInt(heroDamage);
                        dragon3HP = dragon3HP - heroHitsForDmg;
                        System.out.println("You hit Dragon 3 for " + heroHitsForDmg + " dmg.");
                    }

                }

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if(dragon1HP > 0) {
                    int dragon1HitsForDmg = random.nextInt(dragon1Damage);
                    heroHP = heroHP - dragon1HitsForDmg;
                    System.out.println("Dragon 1 hits you for " + dragon1HitsForDmg + "Dmg.");
                }
                if(dragon2HP > 0) {
                    int dragon2HitsForDmg = random.nextInt(dragon2Damage);
                    heroHP = heroHP - dragon2HitsForDmg;
                    System.out.println("Dragon 2 hits you for " + dragon2HitsForDmg + "Dmg.");
                }
                if(dragon3HP > 0) {
                    int dragon3HitsForDmg = random.nextInt(dragon3Damage);
                    heroHP = heroHP - dragon3HitsForDmg;
                    System.out.println("Dragon 3 hits you for " + dragon3HitsForDmg + "Dmg.");
                }

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

            System.out.println("Battle Outcome");
            System.out.println("--------------");
            if (heroWins == false) {
                System.out.println("You Were Defeated!");
            } else {
                System.out.println("You are a hero!!");
            }
    }

}