package be.intecbrussel;

public abstract class Monster {


    private int hitPoints;

    private final int maxHp;


    public Monster(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {

    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        setHitPoints(0);
        this.hitPoints = hitPoints;
    }

    public void Heal(int h) {

    }

    public boolean takeDamage(int d) {

        if (hitPoints <= 0) {
            System.out.println("You are dead noob uninstall");


        }
        return false;
    }

}
