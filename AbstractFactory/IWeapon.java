package AbstractFactory;

/**
 * Abstract Product: Weapon.
 *
 * <p>
 * Weapons are created by the selected family factory so that the weapon fits
 * the chosen game family.
 */
public interface IWeapon {
	/**
	 * Display name of the weapon.
	 */
	String getName();

	/**
	 * Base damage the weapon deals.
	 */
	int getDamage();
}
