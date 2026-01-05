package Observer;

import java.util.List;
import java.util.ArrayList;

public class ButtonPublisher implements IPublisher {
	private int value;
	// Observer pattern guideline: the Subject (publisher) owns its observer list.
	// Keeping it `private` prevents outside code from mutating the list directly,
	// which preserves the Subject's control over subscribe/unsubscribe semantics.
	private final List<ISubscriber> subscribers;

	public ButtonPublisher(int value) {
		// Initialize the subscriber list once in the constructor.
		// (The previous version initialized it twice: at field declaration and here.)
		this.subscribers = new ArrayList<>();
		this.value = value;
	}

	public void setValue(int value) {
		// Observer pattern guideline: notify observers when *state changes*.
		// If you notify on identical values, observers may do redundant work.
		// This guard keeps the example aligned with the usual intent.
		if (this.value == value) {
			return;
		}
		this.value = value;
		notifySubscribers();
	}

	public int getValue() {
		return value;
	}

	@Override
	public void addSubscriber(ISubscriber subscriber) {
		// Defensive checks help keep the example predictable:
		// - null would cause a NullPointerException during notification
		// - duplicates would notify the same subscriber multiple times
		if (subscriber == null) {
			throw new IllegalArgumentException("subscriber cannot be null");
		}
		if (subscribers.contains(subscriber)) {
			return;
		}
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(ISubscriber subscriber) {
		// Removing a non-existent (or null) subscriber is a no-op.
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers() {
		// Push-style update: the Subject sends the new state directly.
		// (A pull-style alternative is to call subscriber.update(this) and let
		// observers query getValue(). Either is a valid Observer variant.)
		for (ISubscriber subscriber : subscribers) {
			subscriber.update(value);
		}
	}

}
