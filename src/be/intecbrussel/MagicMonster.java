package be.intecbrussel;

public abstract class MagicMonster extends Monster {
    private int magicPoints;

    public MagicMonster(int maxHp, int magicPoints) {
        super(maxHp);
        this.magicPoints = magicPoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int h) {

    }

    public void restoreMp(int h) {

     if (h > magicPoints)
         System.out.println("You have reached the maximum magic points!");
      }


    public boolean useMp(int d) {

        if(d >= 0)
            System.out.println("You dont have enough magic points!");

        return true;
    }

}




