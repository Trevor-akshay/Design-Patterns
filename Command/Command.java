package Command;

/**
 * Command interface (the core of the Command pattern).
 *
 * The idea:
 * - Wrap a request as an object.
 * - Client/invoker can execute commands without knowing the receiver details.
 */
public interface Command {
	void execute();
}
