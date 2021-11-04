package be.intecbrussel;

public class Bear {
    private int holeNr;

    public Bear() {

    }

    public Bear(int hitPoints, int ragePoints) {

    }

    public Bear(int holeNr, int hitPoints, int ragePoints) {
        this.holeNr = holeNr;

    }

    public int bearClawAttack() {

        System.out.println("roaar!");

        return bearClawAttack();
    }

}
