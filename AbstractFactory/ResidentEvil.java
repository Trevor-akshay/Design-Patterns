package AbstractFactory;

/**
 * High-level "game" runner.
 *
 * <p>
 * This class is responsible for selecting which product family is being used
 * (RE5 vs RE8). Once selected, it should use a single
 * {@link IResidentEvilFactory}
 * to create all related products.
 */
public class ResidentEvil {
	private final Game game;

	/**
	 * Demo-friendly constructor.
	 *
	 * <p>
	 * In real code, prefer {@link #ResidentEvil(Game)} to avoid stringly-typed
	 * bugs.
	 */
	public ResidentEvil(String game) {
		this(Game.fromString(game));
	}

	public ResidentEvil(Game game) {
		if (game == null) {
			throw new IllegalArgumentException("game must not be null");
		}
		this.game = game;
	}

	public void start() {
		IArena arena = new ArenaFactory();
		IResidentEvilFactory factory = ResidentEvilFactoryProvider.forGame(game);
		arena.createArena(game, factory);
	}
}
