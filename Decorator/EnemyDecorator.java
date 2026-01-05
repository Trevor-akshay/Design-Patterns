package Decorator;

/**
 * Base Decorator (a.k.a. abstract decorator).
 *
 * Decorator pattern rule:
 * - Decorators MUST implement the same interface as the component (IEnemy).
 * - Decorators MUST *wrap* an IEnemy instance and delegate to it.
 *
 * Why this class exists:
 * - Removes duplication across concrete decorators (ArmourWrapper,
 * PoisonWrapper, SpeedWrapper).
 * - Guarantees every decorator has a wrapped component.
 * - Provides default pass-through implementations, so concrete decorators
 * override only what they change.
 */
public abstract class EnemyDecorator implements IEnemy {
	protected final IEnemy enemy;

	protected EnemyDecorator(IEnemy enemy) {
		// Defensive programming: a decorator without a component breaks the pattern.
		if (enemy == null) {
			throw new IllegalArgumentException("enemy cannot be null");
		}
		this.enemy = enemy;
	}

	/**
	 * Default behavior: delegate to wrapped component.
	 * Concrete decorators can add behavior before/after calling super.
	 */
	@Override
	public void attack() {
		enemy.attack();
	}

	@Override
	public int getDamage() {
		return enemy.getDamage();
	}

	@Override
	public int getSpeed() {
		return enemy.getSpeed();
	}

	@Override
	public int getHealth() {
		return enemy.getHealth();
	}
}
