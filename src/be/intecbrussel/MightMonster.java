package be.intecbrussel;

public abstract class MightMonster extends Monster {

    private int ragePoints;
    private int maxRP;

    public MightMonster(int maxRp, int maxHp) {
        super(maxHp);

    }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int h) {

    }

    public void restoreRp(int h) {
}

    public boolean useRp(int d) {

        if (d > ragePoints)
            System.out.println("You can't exceed the maximum Rage points");

        return true;
    }

}
