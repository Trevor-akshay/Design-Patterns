package Command;

/**
 * Receiver in the Command pattern.
 *
 * The receiver knows how to perform the actual work.
 * Commands call methods on the receiver.
 */
public class Editor {
	private String state;

	public Editor(String state) {
		this.state = state;
	}

	public void makeBold() {
		this.setState("<b>" + state + "</b>");
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
