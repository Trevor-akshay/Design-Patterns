package AbstractFactory;

/**
 * Concrete Product (Boss) for the RE5 family.
 */
public class AlbertWesker implements IBoss {
	private final String name;
	private final int health;
	private final int damage;
	private final int armour;

	public AlbertWesker(String name, int health, int damage, int armour) {
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.armour = armour;
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

	@Override
	public int getArmour() {
		return armour;
	}

}
