package Characters;

/**
 * Абстрактний клас для ігрових персонажів.
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y; // Координати

    /**
     * Виконує атаку.
     */
    public abstract void attack();

    /**
     * Рух персонажа на вказані координати.
     */
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.println(name + " перейшов до координат (" + x + ", " + y + ").");
    }

    public String getName() { return name; }
}
