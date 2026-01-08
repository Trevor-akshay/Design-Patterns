package Command;

/**
 * Concrete Command: Undo.
 *
 * This is a common Command-pattern setup:
 * - UndoCommand doesn't know about Editor.
 * - It only knows about History.
 * - History contains commands that know how to undo themselves.
 */
public class UndoCommand implements Command {

	private final History history;

	public UndoCommand(History history) {
		this.history = history;
	}

	@Override
	public void execute() {
		if (history.isEmpty()) {
			return;
		}

		UndoableCommand command = history.popUndo();
		command.unexecute();
	}

}
