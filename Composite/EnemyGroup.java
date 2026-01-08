package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite in the Composite pattern.
 *
 * This class is itself an IEnemy, but internally it contains many IEnemy
 * children.
 * When a client calls an operation on the group, the group forwards that call
 * to all children (and can aggregate results).
 */
public class EnemyGroup implements IEnemy {
	private List<IEnemy> enemies;

	/**
	 * Public so clients can create groups.
	 */
	public EnemyGroup() {
		this.enemies = new ArrayList<>();
	}

	/**
	 * Composite-only operation.
	 *
	 * Note: In some Composite implementations, add/remove live on the Component
	 * interface too. Keeping it only on EnemyGroup is also valid and keeps Leaf
	 * classes (Zombie/Tyrant) simpler.
	 */
	public void addEnemy(IEnemy enemy) {
		enemies.add(enemy);
	}

	@Override
	public void attack() {
		// Delegate the operation to all children.
		for (IEnemy enemy : enemies) {
			enemy.attack();
		}
	}

	@Override
	public int getHealth() {
		// Aggregate child results.
		int health = 0;
		for (IEnemy enemy : enemies) {
			health += enemy.getHealth();
		}

		return health;
	}

}
