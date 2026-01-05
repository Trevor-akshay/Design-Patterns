package State;

// State pattern note:
// - `Leon` is the *Context* (the object whose behavior changes based on state).
// - `IState` is the *State* interface implemented by concrete states.
//
// Why this change is expected:
// In the canonical State pattern, the Context does NOT implement the State interface.
// If it does, the Context becomes substitutable for a State, which blurs responsibilities
// and makes the design less clear (Context vs State roles get mixed).
//
// Instead, the Context exposes business operations (`run`, `attack`) and *delegates*
// the behavior of those operations to the current State object.
public class Leon {
	// Keep current state private so only the Context controls transitions.
	private IState state;

	// Make constructor public so the Context can be created from anywhere.
	// It also validates the initial state via `setState`.
	public Leon(IState state) {
		setState(state);
	}

	public void run() {
		state.run();
	}

	public void attack() {
		state.attack();
	}

	public void setState(IState state) {
		// Defensive check: a null state would cause a NullPointerException
		// when delegating `run()` / `attack()`.
		if (state == null) {
			throw new IllegalArgumentException("state cannot be null");
		}
		this.state = state;
	}

	// Optional helper: lets callers inspect current state for debugging/logging.
	// Not required for the pattern, but harmless and often useful.
	public IState getState() {
		return state;
	}
}
