package Command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * History / undo stack.
 *
 * In many Command implementations, History stores executed commands so that an
 * Undo command can pop and revert the last change.
 */
public class History {
	private final Deque<UndoableCommand> history;

	public History() {
		this.history = new ArrayDeque<>();
	}

	/**
	 * Push an undoable command onto the history stack.
	 */
	public void addCommand(UndoableCommand command) {
		history.add(command);
	}

	/**
	 * Pop the last command to be undone.
	 */
	public UndoableCommand popUndo() {
		return history.pollLast();
	}

	public boolean isEmpty() {
		return history.isEmpty();
	}
}
