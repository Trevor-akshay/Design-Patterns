package Composite;

/**
 * Leaf in the Composite pattern.
 */
public class Tyrant implements IEnemy {

	@Override
	public void attack() {
		System.out.println("Tyrant attacks");
	}

	@Override
	public int getHealth() {
		return 1000;
	}

}
