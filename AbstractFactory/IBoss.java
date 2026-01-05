package AbstractFactory;

/**
 * Abstract Product: Boss.
 *
 * <p>
 * In this example, a boss is an enemy with additional stats (armour).
 * This interface extends {@link IEnemy} to model that relationship.
 */
public interface IBoss extends IEnemy {
	/**
	 * Armour/defense stat for the boss.
	 */
	int getArmour();
}
