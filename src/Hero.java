import java.util.Random;

public class Hero {

    //initialize hp and crit effects
    private int hp;
    private int maxHP;
    private int baseMaxDmg;
    private Random rand = new Random();

    public Hero(int hp, int baseMaxDmg) {
        this.hp = hp;
        this.maxHP = hp;
        this.baseMaxDmg = baseMaxDmg;
    }

    public void heal() {
        int healAmount = (int)(maxHP * 0.15);
        this.hp += healAmount;

        if (this.hp > maxHP) {
            this.hp = maxHP;
        }
        System.out.println(Art.CYAN + "You focused your energy and healed for " + healAmount + " HP!" + Art.RESET);
    }

    public void takeDmg(int amount) {
        this.hp -= amount;
        if(this.hp < 0) this.hp = 0;
    }

    public int calculateAttack() {
        int damage = rand.nextInt(baseMaxDmg) + 1;
        if (rand.nextInt(100) < 15) {
            damage *= 2;
            System.out.println(Art.GREEN + "CRIT! You landed a heavy blow!" + Art.RESET);
        }
        return damage;
    }
    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }
}