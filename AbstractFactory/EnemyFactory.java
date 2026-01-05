package AbstractFactory;

/**
 * Legacy factory for enemy-related products.
 *
 * <p>
 * This class still works, but note that it is not the "true" Abstract Factory
 * for the example because it creates only one product category and requires the
 * caller to pass a game identifier every time.
 *
 * <p>
 * Prefer {@link IResidentEvilFactory} + {@link ResidentEvilFactoryProvider}.
 */
@Deprecated
public class EnemyFactory implements IEnemyFactory {
	public IBoss createBoss(String game) {
		Game parsedGame = Game.fromString(game);
		switch (parsedGame) {
			case RE5:
				return new AlbertWesker("Albert Wesker", 1000, 100, 500);
			case RE8:
				return new Tyrant("Tyrant", 8000, 150, 100);
			default:
				throw new IllegalArgumentException("Unsupported game: " + parsedGame);
		}
	}

	public IEnemy createEnemy(String game) {
		Game parsedGame = Game.fromString(game);
		switch (parsedGame) {
			case RE5:
				return new Licker("Licker", 30, 500);
			case RE8:
				return new Lycan("Lycan", 20, 300);
			default:
				throw new IllegalArgumentException("Unsupported game: " + parsedGame);
		}
	}
}
