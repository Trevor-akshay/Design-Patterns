package ChainOfResponsiblity;

public class Authentication implements IHandler {
	private IHandler next;

	public Authentication(IHandler next) {
		this.next = next;
	}

	@Override
	public void handle(String request) {
		// Chain of Responsibility guideline:
		// A handler can "stop" the chain when it cannot/should not process a request.
		// Here, failed authentication is a natural place to short-circuit.
		//
		// Why this change is expected:
		// `request.equals("user")` would throw a NullPointerException if `request`
		// is null. Using a null-safe check keeps the example robust.
		if (request == null || request.isBlank() || !"user".equals(request)) {
			throw new RuntimeException("User not allowed");
		}

		System.out.println("User authenticated");
		if (next != null)
			next.handle(request);
	}

	@Override
	public void setNext(IHandler next) {
		this.next = next;
	}

}
