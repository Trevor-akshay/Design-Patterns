package Command;

/**
 * Concrete Command: "make the editor state bold".
 *
 * Pattern roles:
 * - This is a Command object.
 * - It holds a reference to the Receiver (Editor).
 * - It also uses History to enable undo.
 */
public class BoldCommand implements UndoableCommand {
	private final History history;
	private final Editor editor;
	/**
	 * Snapshot of the receiver state *before* execute() ran.
	 *
	 * Only set on "undo entry" instances that are pushed to History.
	 */
	private final String snapshot;

	public BoldCommand(History history, Editor editor) {
		this.history = history;
		this.editor = editor;
		this.snapshot = null;
	}

	/**
	 * Private constructor used to create a per-execution undo entry.
	 *
	 * This avoids needing a separate BoldUndo class while still ensuring that the
	 * History stack holds one snapshot per execute() call.
	 */
	private BoldCommand(Editor editor, String snapshot) {
		this.history = null;
		this.editor = editor;
		this.snapshot = snapshot;
	}

	@Override
	public void execute() {
		// Take a snapshot BEFORE changing the receiver.
		String snapshot = editor.getState();
		editor.makeBold();

		// Important correctness detail for undo stacks:
		// If you execute the same BoldCommand instance multiple times and push "this"
		// each time, you'd be pushing the same object reference repeatedly.
		// That would overwrite the previous snapshot and undo would be incorrect.
		//
		// So we push a distinct undo-entry object containing the snapshot for THIS
		// execution.
		// (Same class, different instance.)
		history.addCommand(new BoldCommand(editor, snapshot));
	}

	@Override
	public void unexecute() {
		// Undo entries have a snapshot; "regular" command instances do not.
		// History will only call unexecute() on entries it popped.
		if (snapshot != null) {
			editor.setState(snapshot);
		}
	}
}
