package Characters;

/**
 * Конкретний персонаж: Маг.
 */
public class Mage extends Character {
    public Mage() {
        this.name = "Маг";
        this.health = 100;
        this.attackPower = 40;
    }

    @Override
    public void attack() {
        System.out.println(name + " атакує з силою " + attackPower + "!");
    }
}