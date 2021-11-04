package be.intecbrussel;

public class Witch extends MagicMonster {
    private String name;


    public Witch() {

    }

    public Witch(int hitPoints) {
        this(hitPoints);
    }

    public Witch(int hitPoints, int magicPoints) {

    }

    public Witch(int hitPoints, String name, int magicPoints) {
        this(hitPoints);
        this.name = name;
    }

    public int fireballAttack() {


        System.out.println("Fwooosh!!");

        return fireballAttack();
    }

    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                '}';
    }
}
