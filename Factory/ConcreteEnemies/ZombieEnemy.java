package Factory.ConcreteEnemies;

import Factory.Interface.IEnemy;

/**
 * Concrete product: a basic Zombie.
 *
 * Zombies are the default / common enemy.
 */
public class ZombieEnemy implements IEnemy {
	private String name;
	private int health;
	private int damage;

	public ZombieEnemy() {
		// Zombies are weaker than bosses.
		this.health = 80;
		this.damage = 10;
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