package Factory;

import Characters.Mage;
import Characters.Warrior;
import Characters.Archer;
import Characters.Character;


/**
 * Фабричний метод для створення персонажів.
 */
public class CharacterFactory {
    public static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "воїн":
                return new Warrior();
            case "маг":
                return new Mage();
            case "лучник":
                return new Archer();
            default:
                throw new IllegalArgumentException("Невідомий тип персонажа: " + type);
        }
    }
}
