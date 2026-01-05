package AbstractFactory;

/**
 * Legacy / intermediate abstraction.
 *
 * <p>
 * This interface creates a single product type (enemies/bosses) and takes a
 * {@code game} parameter. That design is closer to a Simple Factory / Factory
 * Method
 * style than a classic Abstract Factory.
 *
 * <p>
 * For a "true" Abstract Factory in this codebase, see
 * {@link IResidentEvilFactory},
 * where the family (RE5 vs RE8) is selected once, and the factory creates all
 * related products without repeatedly switching on a string.
 */
public interface IEnemyFactory {
	public IEnemy createEnemy(String game);

	public IBoss createBoss(String game);
}
