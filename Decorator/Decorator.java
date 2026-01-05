package Decorator;

public class Decorator {
	public static void main(String[] args) {
		IEnemy zombie = new Zombie(100, 10, 15);
		System.out.println("Normal Zombie stats");
		System.out.println(zombie.getDamage() + " " + zombie.getHealth() + "  " + zombie.getSpeed());
		System.out.println("Normal Zombie attack");
		zombie.attack();

		zombie = new ArmourWrapper(zombie);
		zombie = new PoisonWrapper(zombie);

		System.out.println("Poisonous and Armoured Zombie stats");

		System.out.println(zombie.getDamage() + " " + zombie.getHealth() + "  " + zombie.getSpeed());
		System.out.println("Poisonous and Armoured Zombie attack");
		zombie.attack();
	}
}
