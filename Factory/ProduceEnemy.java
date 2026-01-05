package Factory;

import Factory.ConcreteEnemies.AlbertWeskerEnemy;
import Factory.ConcreteEnemies.MrXEnemy;
import Factory.ConcreteEnemies.ZombieEnemy;
import Factory.Interface.IEnemy;

public class ProduceEnemy {
	/**
	 * This class is a "Simple Factory".
	 *
	 * Important idea:
	 * - A factory's job is to CREATE objects.
	 * - Code that uses the factory should not need to call `new ZombieEnemy()` etc.
	 *
	 * Your previous version did this:
	 * - Accept an already-created IEnemy instance
	 * - Use `instanceof` checks to guess its type
	 * - Create another instance and return it
	 *
	 * Why that was a mistake:
	 * - If you already had an enemy instance, you don't need a factory.
	 * - `instanceof` tightly couples the factory to every concrete class.
	 * - The caller still needs to know which class to instantiate to pass in.
	 */
	public ProduceEnemy() {
		// No state needed. A factory generally doesn't store "the thing" it creates.
	}

	/**
	 * Create a new enemy based on the requested EnemyType.
	 *
	 * @param type which kind of enemy you want
	 * @return a fresh enemy instance (with default stats set in its constructor)
	 */
	public IEnemy createEnemy(EnemyType type) {
		// switch is a clean, beginner-friendly way to choose which class to
		// instantiate.
		// If you later add a new enemy type, you update this switch in ONE place.
		switch (type) {
			case ALBERT_WESKER:
				return new AlbertWeskerEnemy();
			case MR_X:
				return new MrXEnemy();
			case ZOMBIE:
			default:
				return new ZombieEnemy();
		}
	}
}
