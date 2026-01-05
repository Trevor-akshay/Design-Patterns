package AbstractFactory;

/**
 * Concrete Abstract Factory for the RE5 product family.
 *
 * <p>
 * All products created by this factory belong to the RE5 "world".
 */
public class Re5Factory implements IResidentEvilFactory {
	@Override
	public IHero createHero() {
		return new Chris("Chris");
	}

	@Override
	public IEnemy createEnemy() {
		return new Licker("Licker", 30, 500);
	}

	@Override
	public IBoss createBoss() {
		return new AlbertWesker("Albert Wesker", 1000, 100, 500);
	}

	@Override
	public IWeapon createWeapon() {
		return new Pistol("pistol", 20);
	}
}
