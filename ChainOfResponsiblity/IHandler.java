package ChainOfResponsiblity;

public interface IHandler {
	void handle(String request);

	void setNext(IHandler next);
}
