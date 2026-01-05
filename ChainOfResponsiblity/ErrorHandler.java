package ChainOfResponsiblity;

public class ErrorHandler implements IHandler {
	private IHandler next;

	public ErrorHandler(IHandler next) {
		this.next = next;
	}

	@Override
	public void handle(String request) {
		// Chain of Responsibility guideline:
		// A handler should either:
		// 1) handle the request, OR
		// 2) forward it to the next handler.
		//
		// Why this change is expected:
		// In the previous version, this class printed an "error captured" message
		// for *every* request even when there was no error. That isn't really an
		// error handler — it's just another always-on step in the chain.
		//
		// A more faithful "ErrorHandler" wraps the rest of the chain and catches
		// exceptions thrown by downstream handlers.
		try {
			if (next != null) {
				next.handle(request);
			}
		} catch (RuntimeException ex) {
			System.out.println("Error captured by ErrorHandler: " + ex.getMessage());
			// In a real system you might rethrow, map to an error response, etc.
		}
	}

	@Override
	public void setNext(IHandler next) {
		this.next = next;
	}

}
