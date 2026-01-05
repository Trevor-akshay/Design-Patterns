package Decorator;

/**
 * Concrete Decorator.
 *
 * Poison increases damage output. Notice how we do not need to subclass Zombie;
 * we wrap *any* IEnemy instance, which is the core advantage of Decorator.
 */
public class PoisonWrapper extends EnemyDecorator {
	public PoisonWrapper(IEnemy enemy) {
		super(enemy);
	}

	@Override
	public int getDamage() {
		return super.getDamage() + 10;
	}

	@Override
	public void attack() {
		System.out
				.println("Poisonous Zombie attacks with damage: " + this.getDamage() + " and speed: " + super.getSpeed()
						+ " and has " + super.getHealth() + " health");
	}
}
