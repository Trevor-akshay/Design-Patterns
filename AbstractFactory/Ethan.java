package AbstractFactory;

/**
 * Concrete Product (Hero) for the RE8 family.
 */
public class Ethan implements IHero {
	private final String name;

	public Ethan(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
