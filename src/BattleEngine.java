import java.util.Scanner;

public class BattleEngine {
    private Hero hero;
    private Dragon[] dragons;
    private Scanner sc = new Scanner(System.in);

    public BattleEngine(Hero hero, Dragon[] dragons) {
        this.hero = hero;
        this.dragons = dragons;
    }

    public void run() {
        while (hero.getHP() > 0 && isAnyDragonAlive()) {
            PrintStatus.showBattlefield(hero, dragons);
            // 1. HERO TURN
            heroTurn();
            if (!isAnyDragonAlive()) break;

            // 2. DRAGONS TURN
            dragonsTurn();
        }

        if (hero.getHP() > 0) {
            System.out.println(Art.win());
        } else {
            System.out.println(Art.lose());
        }
    }
/*
    private void heroTurn() {
        System.out.println("\n--- YOUR TURN ---");
        System.out.println("Which dragon do you attack? (1, 2, or 3)");
        int target = sc.nextInt()-1;

        if (dragons[target].getHitPoints() > 0) {
            int dmg = hero.calculateAttack(); // This pops the GameWindow!
            dragons[target].takeDmg(dmg);
            System.out.println("You hit " + dragons[target].getName() + " for " + dmg + "!");
        } else {
            System.out.println("That dragon is already down! You wasted your turn!");
        }
    }

 */
    private void heroTurn() {
        System.out.println("\n--- YOUR TURN ---");
        System.out.println("1. Attack a Dragon");
        System.out.println("2. Heal (15% Max HP)");
        System.out.print("Choice: ");
        int action = sc.nextInt();

        if (action == 2) {
            hero.heal();
        } else {
            System.out.println("Which dragon do you attack? (1, 2, or 3)");
            int target = sc.nextInt() - 1;
            if (target >= 0 && target < dragons.length && dragons[target].getHitPoints() > 0) {
                int dmg = hero.calculateAttack();
                dragons[target].takeDmg(dmg);
                System.out.println("You hit " + dragons[target].getName() + " for " + dmg + "!");
            } else {
                System.out.println("Invalid target! You fumbled your weapon and wasted the turn.");
            }
        }
    }

    private void dragonsTurn() {
        System.out.println("\n--- DRAGONS ARE ATTACKING ---");
        for (Dragon d : dragons) {
            if (d.getHitPoints() > 0) {
                int incoming = d.attack(hero);
                hero.takeDmg(incoming);
                System.out.println(Art.GREEN + d.getName() + " strikes you for " + incoming + " damage!" + Art.RESET);
            }
        }
        System.out.println(Art.CYAN + "Your HP is now: " + hero.getHP() + Art.RESET);
    }

    private boolean isAnyDragonAlive() {
        for (Dragon d : dragons) {
            if (d.getHitPoints() > 0) return true;
        }
        return false;
    }


}