package Observer;

import Characters.Character;

/**
 * Конкретний спостерігач, який повідомляє гравців про зміни на арені.
 */
public class PlayerNotifier implements ArenaObserver {
    @Override
    public void update(Character character) {
        System.out.println("Гравець отримує сповіщення: додано " + character.getName() + " на арену.");
    }
}