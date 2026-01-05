package Decorator;

/**
 * Component interface for the Decorator pattern.
 *
 * Key Decorator rule:
 * - The concrete component (Zombie) and all decorators (wrappers) must share
 * this exact API.
 * That way, callers can treat a decorated object exactly like the original.
 */
public interface IEnemy {
	/**
	 * An example behaviour method.
	 *
	 * IMPORTANT: If a method exists on the concrete component but not here,
	 * decorators cannot transparently decorate that behaviour.
	 */
	void attack();

	int getDamage();

	int getSpeed();

	int getHealth();

}
