package Factory.Interface;

/**
 * This is the "product" interface in the Factory pattern.
 *
 * Factory vocabulary:
 * - Product = the thing you create (Enemy)
 * - Factory = the class/method that creates products
 *
 * Why we use an interface here:
 * - The rest of the game (ResidentEvil) depends on IEnemy, not concrete
 * classes.
 * - That keeps game code flexible: swap enemy types without rewriting game
 * logic.
 */
public interface IEnemy extends IEnemyStats {
	/**
	 * Display name shown in the game (e.g., "Albert Wesker").
	 */
	void setName(String name);

	String getName();
}