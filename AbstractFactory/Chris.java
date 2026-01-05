package AbstractFactory;

/**
 * Concrete Product (Hero) for the RE5 family.
 */
public class Chris implements IHero {
	private final String name;

	public Chris(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
