package Characters;

/**
 * Конкретний персонаж: Лучник.
 */
public class Archer extends Character {
    public Archer() {
        this.name = "Лучник";
        this.health = 120;
        this.attackPower = 30;
    }

    @Override
    public void attack() {
        System.out.println(name + " атакує з силою " + attackPower + "!");
    }
}
