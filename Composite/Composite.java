package Composite;

public class Composite {
	public static void main(String[] args){
		IEnemy zombie = new Zombie();
		IEnemy tyrant = new Tyrant();

		EnemyGroup enemyGroup = new EnemyGroup();
		enemyGroup.addEnemy(zombie);
		enemyGroup.addEnemy(tyrant);

		enemyGroup.attack();
		System.out.println(enemyGroup.getHealth());
	}
}
