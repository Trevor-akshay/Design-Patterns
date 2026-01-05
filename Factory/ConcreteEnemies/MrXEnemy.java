package Factory.ConcreteEnemies;

import Factory.Interface.IEnemy;

/**
 * Concrete product: Mr. X.
 *
 * This class represents one specific enemy. The factory will create this
 * when EnemyType.MR_X is requested.
 */
public class MrXEnemy implements IEnemy {
	private String name;
	private int health;
	private int damage;

	public MrXEnemy() {
		// Mr. X is tanky and hits hard.
		this.health = 400;
		this.damage = 50;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

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
