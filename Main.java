import Factory.EnemyType;
import Factory.ResidentEvil;

public class Main {
	public static void main(String[] args) {
		// --- Singleton demo (optional) ---
		// var instance = Singleton.getInstance();
		// instance.print();

		// --- Factory demo ---
		// We create the game. The game uses a factory internally to spawn enemies.
		// Main does NOT need to instantiate concrete enemies directly.
		ResidentEvil re = new ResidentEvil();

		re.spawnEnemy(EnemyType.ALBERT_WESKER, "Albert Wesker");
		re.spawnEnemy(EnemyType.MR_X, "Mr. X");
		re.spawnEnemy(EnemyType.ZOMBIE, "Random Zombie");
	}
}
