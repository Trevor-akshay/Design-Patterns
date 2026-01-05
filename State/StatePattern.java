package State;

public class StatePattern {
	public static void main(String[] args) {
		Leon leon = new Leon(new HealthyState());

		leon.run();
		leon.attack();

		leon.setState(new InjuredState());

		leon.run();
		leon.attack();

	}
}
