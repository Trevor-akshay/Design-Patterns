package AbstractFactory;

/**
 * Represents the supported "product families" for this Abstract Factory
 * example.
 *
 * <p>
 * Key point for Abstract Factory: the family (RE5 vs RE8) should be selected
 * once, and then the factory for that family creates a set of related objects
 * (hero, enemy, boss, weapon) that belong together.
 */
public enum Game {
	RE5("re5"),
	RE8("re8");

	private final String id;

	Game(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/**
	 * Parses user input into a supported {@link Game}.
	 *
	 * <p>
	 * This replaces scattered string comparisons like {@code game.equals("re5")}.
	 * Centralizing parsing avoids typos and avoids {@link NullPointerException}.
	 */
	public static Game fromString(String value) {
		if (value == null) {
			throw new IllegalArgumentException("game must not be null");
		}

		String normalized = value.trim().toLowerCase();
		for (Game game : values()) {
			if (game.id.equals(normalized)) {
				return game;
			}
		}

		throw new IllegalArgumentException("Unknown game: '" + value + "'. Supported: re5, re8");
	}
}
