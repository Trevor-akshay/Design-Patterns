package Command;

public class CommandPattern {
	public static void main(String[] args) {
		Editor editor = new Editor("Hello world");
		History history = new History();
		BoldCommand boldCommand = new BoldCommand(history, editor);
		System.out.println("The Initial state:");

		System.out.println(editor.getState());
		boldCommand.execute();
		System.out.println("The current state after the Bold Command has been executed:");

		System.out.println(editor.getState());

		UndoCommand undoCommand = new UndoCommand(history);
		undoCommand.execute();

		System.out.println("The current state after the Undo Command has been executed:");

		System.out.println(editor.getState());
	}
}
