package AbstractFactory;

/**
 * Legacy / intermediate abstraction.
 *
 * <p>
 * This creates only weapons and takes a {@code game} parameter. This works for
 * demos, but it is not the core idea of Abstract Factory.
 *
 * <p>
 * Prefer using {@link IResidentEvilFactory} where the family is selected once.
 */
public interface IWeaponFactory {
	IWeapon createWeapon(String game);
}
