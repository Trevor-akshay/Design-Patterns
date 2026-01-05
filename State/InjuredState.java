package State;

public class InjuredState implements IState{

	@Override
	public void run() {
		System.out.println("Leon runs slow");
	}

	@Override
	public void attack() {
		System.out.println("Leon misses some attack");
	}
	
}
