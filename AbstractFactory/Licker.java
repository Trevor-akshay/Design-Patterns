package AbstractFactory;

/**
 * Concrete Product (Enemy) for the RE5 family.
 */
public class Licker implements IEnemy {
	private final String name;
	private final int damage;
	private final int health;

	public Licker(String name, int damage, int health) {
		this.name = name;
		this.damage = damage;
		this.health = health;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public int getDamage() {
		return damage;
	}

}
