package AbstractFactory;

/**
 * Concrete Abstract Factory for the RE8 product family.
 *
 * <p>
 * All products created by this factory belong to the RE8 "world".
 */
public class Re8Factory implements IResidentEvilFactory {
	@Override
	public IHero createHero() {
		return new Ethan("Ethan");
	}

	@Override
	public IEnemy createEnemy() {
		return new Lycan("Lycan", 20, 300);
	}

	@Override
	public IBoss createBoss() {
		return new Tyrant("Tyrant", 8000, 150, 100);
	}

	@Override
	public IWeapon createWeapon() {
		return new Shotgun("shotgun", 100);
	}
}
