package AbstractFactory;

/**
 * Legacy factory for weapon product.
 *
 * <p>
 * Prefer selecting a single family factory (see {@link IResidentEvilFactory})
 * and creating all related products from it.
 */
@Deprecated
public class WeaponFactory implements IWeaponFactory {
	public IWeapon createWeapon(String game) {
		Game parsedGame = Game.fromString(game);
		switch (parsedGame) {
			case RE5:
				return new Pistol("pistol", 20);
			case RE8:
				return new Shotgun("shotgun", 100);
			default:
				throw new IllegalArgumentException("Unsupported game: " + parsedGame);
		}
	}
}
