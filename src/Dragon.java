import java.util.Random;

import static java.lang.Thread.sleep;

public class Dragon {
    private String name; //of dragon
    private int hp;
    private int maxDmg;
    private String type; //what kind of dragon
    private Random rand = new Random();

    public Dragon(String name, int hp, int maxDmg, String type) {
        this.name = name;
        this.hp = hp;
        this.maxDmg = maxDmg;
        this.type = type;
    }

    //crit logic
    public int attack(Hero hero) {
        int baseDmg = rand.nextInt(maxDmg) + 1;
        boolean isCrit = rand.nextInt(100) < 15; // 15% Crit Chance

        if (isCrit) {
            //crit dmg
            baseDmg = (int)(baseDmg * 1.5);
            System.out.print(Art.RED + "CRIT! " + Art.RESET);
            //crit heal
            System.out.print(Art.RED + "CRIT! " + Art.RESET);
            System.out.println(Art.YELLOW + name + " siphons your soul and heals 20 HP!" + Art.RESET);
            try {
                sleep(1800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        return baseDmg;
    }

    public int getHitPoints() {
        return hp; }
    public void setHitPoints(int hp) {
        this.hp = hp; }
    public String getName() {
        return name; }

    public void takeDmg(int amount) {
        this.hp -= amount;
        if (this.hp <0) this.hp = 0;
    }
}