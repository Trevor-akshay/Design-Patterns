package AbstractFactory;

/**
 * Concrete Product (Weapon) used by the RE8 family in this demo.
 */
public class Shotgun implements IWeapon {
	private final String name;
	private final int damage;

	public Shotgun(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getDamage() {
		return this.damage;
	}
}
