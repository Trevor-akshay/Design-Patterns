package State;

public class PoisonedState implements IState {
	@Override
	public void run() {
		System.out.println("Leon slutters");
	}

	@Override
	public void attack() {
		System.out.println("Leon could not focus");
	}

}