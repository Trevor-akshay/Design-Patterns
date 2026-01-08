package Composite;

/**
 * Component interface in the Composite pattern.
 *
 * The key Composite rule:
 * - Both Leaf objects (e.g., Zombie, Tyrant) and Composite objects (EnemyGroup)
 * implement the SAME interface.
 *
 * That lets client code treat a single enemy and a group of enemies uniformly.
 */
public interface IEnemy {
	/**
	 * An operation the client wants to perform on an enemy.
	 *
	 * In Composite, Leaf performs the real work, and Composite forwards the call to
	 * children.
	 */
	void attack();

	/**
	 * Another operation that can be aggregated by the Composite.
	 *
	 * Here, EnemyGroup returns the sum of child health values.
	 */
	int getHealth();
}
