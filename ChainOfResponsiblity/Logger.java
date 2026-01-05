package ChainOfResponsiblity;

public class Logger implements IHandler {
	private IHandler next;

	public Logger(IHandler next) {
		this.next = next;
	}

	@Override
	public void handle(String request) {
		// Logging is a classic CoR step: it performs a side-effect and forwards.
		System.out.println("Logging request: " + request);
		if (next != null)
			next.handle(request);
	}

	@Override
	public void setNext(IHandler next) {
		this.next = next;
	}

}
