package Factory.ConcreteEnemies;

import Factory.Interface.IEnemy;

/**
 * A concrete product (one specific Enemy).
 *
 * In the Factory pattern, each concrete product is a different class,
 * but they all share a common interface (IEnemy).
 */
public class AlbertWeskerEnemy implements IEnemy {
	private String name;
	private int health;
	private int damage;

	public AlbertWeskerEnemy() {
		// Default stats for this enemy type.
		// These can be tweaked later to balance gameplay.
		this.health = 250;
		this.damage = 35;
	}

	/**
	 * Name is optional; if not set, you can still spawn the enemy.
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * Stats methods come from IEnemyStats (which IEnemy extends).
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public int getHealth() {
		return health;
	}
}
