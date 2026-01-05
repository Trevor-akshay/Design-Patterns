package AbstractFactory;

/**
 * Legacy factory for hero product.
 *
 * <p>
 * This factory exists from the earlier design where each product category
 * had its own factory and switched on a {@code game} string. In a classic
 * Abstract Factory, you would instead create ONE family factory (RE5/RE8)
 * that can create all products.
 */
@Deprecated
public class HeroFactory implements IHeroFactory {
	public IHero createHero(String game) {
		Game parsedGame = Game.fromString(game);
		switch (parsedGame) {
			case RE5:
				return new Chris("Chris");
			case RE8:
				return new Ethan("Ethan");
			default:
				throw new IllegalArgumentException("Unsupported game: " + parsedGame);
		}
	}
}
