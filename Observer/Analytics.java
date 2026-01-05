package Observer;

public class Analytics implements ISubscriber{

	@Override
	public void update(int value) {
		System.out.println("Analytics got notified with value: " + value);
	}
	
}
