package Factory;

/**
 * A simple list of all enemy "kinds" the game can spawn.
 *
 * Why this exists:
 * - Your game code should NOT need to know concrete class names like
 * ZombieEnemy.
 * - The factory can switch on this type and decide which class to instantiate.
 */
public enum EnemyType {
	ALBERT_WESKER,
	MR_X,
	ZOMBIE
}
