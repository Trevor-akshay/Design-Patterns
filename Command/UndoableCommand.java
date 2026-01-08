package Command;

/**
 * Extension of Command that supports undo.
 *
 * Typical rule:
 * - The command must have enough information to restore state when unexecute()
 * is called.
 */
public interface UndoableCommand extends Command {
	void unexecute();
}
