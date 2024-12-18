package Characters;

/**
 * Конкретний персонаж: Воїн.
 */
public class Warrior extends Character {
    public Warrior() {
        this.name = "Воїн";
        this.health = 150;
        this.attackPower = 20;
    }

    @Override
    public void attack() {
        System.out.println(name + " атакує з силою " + attackPower + "!");
    }
}
