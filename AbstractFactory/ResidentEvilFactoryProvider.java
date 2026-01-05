package AbstractFactory;

/**
 * Simple factory/provider for selecting the right Abstract Factory.
 *
 * <p>
 * This keeps selection logic out of your client code (e.g.,
 * {@link ResidentEvil}
 * or {@link ArenaFactory}). In a bigger program, you might choose the factory
 * via
 * config, DI, command-line args, etc.
 */
public final class ResidentEvilFactoryProvider {
	private ResidentEvilFactoryProvider() {
		// Utility class
	}

	public static IResidentEvilFactory forGame(Game game) {
		if (game == null) {
			throw new IllegalArgumentException("game must not be null");
		}

		switch (game) {
			case RE5:
				return new Re5Factory();
			case RE8:
				return new Re8Factory();
			default:
				// Defensive: enums can be extended later.
				throw new IllegalArgumentException("Unsupported game: " + game);
		}
	}
}
