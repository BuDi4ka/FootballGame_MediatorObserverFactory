package Observer;

import Characters.Character;

/**
 * Інтерфейс спостерігача для інформування про зміни на арені.
 */
public interface ArenaObserver {
    void update(Character character);
}
