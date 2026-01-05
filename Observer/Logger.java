package Observer;

public class Logger implements ISubscriber {
	@Override
	public void update(int value) {
		System.out.println("Logger got notified with value: " + value);
	}

}
