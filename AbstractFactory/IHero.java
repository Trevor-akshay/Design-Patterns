package AbstractFactory;

/**
 * Abstract Product: Hero.
 *
 * <p>
 * Different game families provide different heroes (e.g., {@link Chris} in RE5,
 * {@link Ethan} in RE8), but the client code can depend only on this interface.
 */
public interface IHero {
	/**
	 * Display name of the hero.
	 */
	String getName();
}
