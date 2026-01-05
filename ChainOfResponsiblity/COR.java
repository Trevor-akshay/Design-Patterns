package ChainOfResponsiblity;

public class COR {
	public static void main(String[] args) {
		// Chain of Responsibility guideline:
		// Order matters. You call the *head* of the chain, which may forward to the
		// next,
		// and so on until the chain ends or a handler stops it.
		//
		// Why this change is expected:
		// If you want an ErrorHandler to catch downstream exceptions, it should be
		// placed at the *start* (wrapping the rest of the chain), not at the end.
		IHandler logger = new Logger(null);
		IHandler auth = new Authentication(logger);
		IHandler errorHandler = new ErrorHandler(auth);

		// Call the head of the chain.
		errorHandler.handle("user");

		System.out.println("--------------------");
		errorHandler.handle("");
	}
}
