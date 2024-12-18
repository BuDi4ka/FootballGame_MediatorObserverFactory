package Arena;

import Characters.Character;
import Observer.PlayerNotifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Медіатор для координації дій персонажів.
 */
public class Arena {
    private List<PlayerNotifier> observers = new ArrayList<>();

    /**
     * Додає спостерігача.
     */
    public void addObserver(PlayerNotifier observer) {
        observers.add(observer);
    }

    /**
     * Сповіщає всіх спостерігачів.
     */
    public void notifyObservers(Character character) {
        for (PlayerNotifier observer : observers) {
            observer.update(character);
        }
    }

    /**
     * Додає персонажа на арену.
     */
    public void addCharacter(Character character) {
        System.out.println(character.getName() + " додається на арену.");
        notifyObservers(character);
    }
}