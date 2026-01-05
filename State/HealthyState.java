package State;

public class HealthyState implements IState {
	@Override
	public void run() {
		System.out.println("Leon runs fast");
	}

	@Override
	public void attack() {
		System.out.println("Leon attacks quick and accurate");
	}

}
