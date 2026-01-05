package Observer;

public class OberserPattern {
	public static void main(String[] args){
		ButtonPublisher buttonPublisher = new ButtonPublisher(5);

		Logger logger = new Logger();
		Analytics analytics = new Analytics();

		buttonPublisher.addSubscriber(logger);
		buttonPublisher.addSubscriber(analytics);
		
		buttonPublisher.notifySubscribers();
		buttonPublisher.setValue(10);
	}
}
