package Decorator;

/**
 * Concrete Decorator.
 *
 * Speed boosts movement speed. We only override getSpeed() because that's the
 * only
 * feature this decorator changes.
 */
public class SpeedWrapper extends EnemyDecorator {
	public SpeedWrapper(IEnemy enemy) {
		super(enemy);
	}

	@Override
	public int getSpeed() {
		return super.getSpeed() + 10;
	}

	@Override
	public void attack() {
		// Delegate so the wrapped enemy (and any inner decorators) can run first.
		super.attack();
		System.out.println(
				"Speed boosted Zombie attacks with damage: " + super.getDamage() + " and speed: " + this.getSpeed()
						+ " and has " + super.getHealth() + " health");
	}
}