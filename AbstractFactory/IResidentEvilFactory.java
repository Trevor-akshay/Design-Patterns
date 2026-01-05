package AbstractFactory;

/**
 * Abstract Factory (the important interface in this pattern).
 *
 * <p>
 * A single factory represents a single "family" (RE5 or RE8) and can create
 * a set of related products that are designed to work together.
 *
 * <p>
 * Compared to the earlier approach (separate
 * HeroFactory/EnemyFactory/WeaponFactory
 * with repeated game-switching), this design:
 * <ul>
 * <li>Chooses the family once (which game you're in)</li>
 * <li>Eliminates repeated {@code if(game.equals("re5"))} checks</li>
 * <li>Makes it harder to accidentally mix families (e.g., RE5 hero with RE8
 * enemy)</li>
 * </ul>
 */
public interface IResidentEvilFactory {
	IHero createHero();

	IEnemy createEnemy();

	IBoss createBoss();

	IWeapon createWeapon();
}
