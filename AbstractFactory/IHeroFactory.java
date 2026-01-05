package AbstractFactory;

/**
 * Legacy / intermediate abstraction.
 *
 * <p>
 * This creates only heroes and takes a {@code game} parameter. In a classic
 * Abstract Factory, you would not switch on a game in each product factory;
 * you'd
 * pick one family factory (RE5/RE8) and create everything from it.
 *
 * <p>
 * See {@link IResidentEvilFactory} for the pattern-correct abstraction.
 */
public interface IHeroFactory {
	IHero createHero(String game);
}
