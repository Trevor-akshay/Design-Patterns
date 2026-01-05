package Decorator;

/**
 * Concrete Decorator.
 *
 * Armour adds survivability without changing the underlying enemy class.
 * Implementation rule: override ONLY the parts you want to change, and delegate
 * the rest.
 */
public class ArmourWrapper extends EnemyDecorator {
	public ArmourWrapper(IEnemy enemy) {
		super(enemy);
	}

	@Override
	public int getHealth() {
		// Decorator behaviour: augment the wrapped component's result.
		return super.getHealth() + 300;
	}

	@Override
	public void attack() {
		System.out.println("Armoured attacks with damage: " + super.getDamage() + " and speed: " + super.getSpeed()
				+ " and has " + this.getHealth() + " health");
	}
}
