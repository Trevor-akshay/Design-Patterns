package Factory;

import Factory.Interface.IEnemy;

public class ResidentEvil {
	/**
	 * Notice what ResidentEvil depends on:
	 * - It depends on IEnemy (interface)
	 * - It depends on ProduceEnemy (factory)
	 * - It depends on EnemyType (an enum / identifier)
	 *
	 * It does NOT depend on:
	 * - AlbertWeskerEnemy
	 * - MrXEnemy
	 * - ZombieEnemy
	 *
	 * That is the main win of the Factory pattern: game logic stays the same
	 * even when you add or swap enemy classes.
	 */
	private final ProduceEnemy enemyFactory;

	public ResidentEvil() {
		// In a bigger project you'd likely inject this (dependency injection).
		// For now, we just create it here.
		this.enemyFactory = new ProduceEnemy();
	}

	/**
	 * "Spawn" (create) an enemy based on the requested type.
	 *
	 * @param type        which enemy the game wants
	 * @param displayName what name to show (optional)
	 */
	public void spawnEnemy(EnemyType type, String displayName) {
		IEnemy enemy = enemyFactory.createEnemy(type);

		// You can configure the enemy after creation.
		// Default stats were already set inside each enemy's constructor.
		enemy.setName(displayName);

		System.out.println("Spawned: " + enemy.getName());
		System.out.println("Health:  " + enemy.getHealth());
		System.out.println("Damage:  " + enemy.getDamage());
		System.out.println("------------------------");
	}
}
