package AbstractFactory;

/**
 * Abstract Product: Enemy.
 *
 * <p>
 * This is one of the products that the Abstract Factory creates.
 * The goal is that RE5 and RE8 can both provide an {@link IEnemy},
 * but the concrete type differs (e.g., {@link Licker} vs {@link Lycan}).
 */
public interface IEnemy {
	/**
	 * Display name of the enemy.
	 */
	String getName();

	/**
	 * Current/base health of the enemy.
	 */
	int getHealth();

	/**
	 * Base damage dealt by the enemy.
	 */
	int getDamage();
}
