package Decorator;

/**
 * Concrete Component in the Decorator pattern.
 *
 * This class provides the "core" behaviour and state. Decorators will wrap an
 * IEnemy
 * (often a Zombie) and add/modify behaviour without changing this class.
 */
public class Zombie implements IEnemy {
	private int health;
	private int speed;
	private int damage;

	/**
	 * Public so callers can create the concrete component.
	 */
	public Zombie(int health, int speed, int damage) {
		this.health = health;
		this.speed = speed;
		this.damage = damage;
	}

	/**
	 * Behaviour method that decorators can decorate.
	 *
	 * Note: This used to exist only on Zombie (not on IEnemy), which meant a
	 * decorated
	 * IEnemy could not be used wherever a Zombie with attack() was expected.
	 */
	@Override
	public void attack() {
		System.out.println("Zombie attacks with damage: " + this.getDamage() + " and speed: " + this.getSpeed()
				+ " and has " + this.getHealth() + " health");
	}

	@Override
	public int getDamage() {
		return damage;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public int getHealth() {
		return health;
	}

	public void setDamage(int damage) {
		// Bug fix: previously this called itself recursively and would overflow the
		// stack.
		this.damage = damage;
	}

	public void setSpeed(int speed) {
		// Bug fix: previously this called itself recursively and would overflow the
		// stack.
		this.speed = speed;
	}

	public void setHealth(int health) {
		// Bug fix: previously this called itself recursively and would overflow the
		// stack.
		this.health = health;
	}
}
