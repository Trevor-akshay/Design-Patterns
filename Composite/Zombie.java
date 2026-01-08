package Composite;

/**
 * Leaf in the Composite pattern.
 *
 * Leaf objects have no children. They implement the Component interface
 * directly.
 */
public class Zombie implements IEnemy {

	@Override
	public void attack() {
		System.out.println("Zombie attacks");
	}

	@Override
	public int getHealth() {
		return 100;
	}

}
