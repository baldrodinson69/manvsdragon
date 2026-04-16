import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintStatus {
    Scanner scanner = new Scanner(System.in);
    public static void battleUpdate(Hero hero, Dragon target) {
        System.out.println("\n========================================");
        System.out.println(Art.CYAN + "HERO HP: " + hero.getHP() + Art.RESET);
        System.out.println(Art.RED + target.getName() + " HP: " + target.getHitPoints() + Art.RESET);
        System.out.println("========================================\n");
    }

    public static void divider() {
        System.out.println("----------------------------------------");
        }

    public static void attackResult(String attacker, String victim, int damage, boolean isCrit) {
        String color = attacker.equals("Hero") ? Art.GREEN : Art.RED;

        if (isCrit) {
            System.out.println(color + "!!! CRITICAL HIT !!!" + Art.RESET);
        }
        System.out.println(attacker + " dealt " + Art.RED + damage + " damage to " + Art.RESET + victim + ".");
    }
    public static void showBattlefield(Hero hero, Dragon[] dragons) {
        // art based on who is alive
        boolean d0 = dragons[0].getHitPoints() > 0;
        boolean d1 = dragons[1].getHitPoints() > 0;
        boolean d2 = dragons[2].getHitPoints() > 0;

        if (d0 && d1 && d2) System.out.println(Art.getArt123(dragons));
        else if (d1 && d2) System.out.println(Art.getArt23(dragons));
        else if (d0 && d2) System.out.println(Art.getArt13(dragons));
        else if (d0 && d1) System.out.println(Art.getArt12(dragons));
        else if (d0) System.out.println(Art.getArt1(dragons));
        else if (d1) System.out.println(Art.getArt2(dragons));
        else if (d2) System.out.println(Art.getArt3(dragons));

        System.out.println(Art.GREEN + "HERO HP: " + hero.getHP() + Art.RESET);
    }
    public static void start() {
        for (String s : List.of("                                    Hero's Final Battle \n" + "                                    ____________________\n" + Art.splashScreen())) {
            System.out.println(s);
            System.out.println("Enter your HP and Max Damage:");
//            Scanner scanner = new Scanner(System.in);
//            Hero player = new Hero(scanner.nextInt(), scanner.nextInt());
        }
    }
}
