package AbstractFactory;

/**
 * Client-side abstraction for running/assembling a "scene" (arena) using a set
 * of
 * related objects.
 *
 * <p>
 * Note: despite the name, this interface is NOT the Abstract Factory itself.
 * The Abstract Factory in this example is {@link IResidentEvilFactory}.
 */
public interface IArena {
	/**
	 * Backwards-compatible entrypoint for demos that still pass in a String.
	 *
	 * <p>
	 * Internally this should map to a {@link Game} and then select the proper
	 * {@link IResidentEvilFactory} exactly once.
	 */
	void createArena(String game);

	/**
	 * Preferred entrypoint: the caller selects the game family once and provides
	 * the pre-selected {@link IResidentEvilFactory}.
	 */
	void createArena(Game game, IResidentEvilFactory factory);
}
