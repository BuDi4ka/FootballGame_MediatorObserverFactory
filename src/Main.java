import Arena.Arena;
import Characters.Character;
import Factory.CharacterFactory;
import Observer.PlayerNotifier;

/**
 * Основний клас для запуску програми.
 */
public class Main {
    public static void main(String[] args) {
        // Створюємо арену (Медіатор)
        Arena arena = new Arena();

        // Додаємо спостерігача
        arena.addObserver(new PlayerNotifier());

        // Створюємо персонажів за допомогою фабричного методу
        Character warrior = CharacterFactory.createCharacter("воїн");
        Character mage = CharacterFactory.createCharacter("маг");
        Character archer = CharacterFactory.createCharacter("лучник");

        // Додаємо персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Виконуємо дії персонажів
        warrior.attack();
        mage.attack();
        archer.move(10, 20);
    }
}