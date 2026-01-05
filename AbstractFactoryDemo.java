import AbstractFactory.ResidentEvil;

/**
 * Demo entrypoint for the Abstract Factory pattern.
 *
 * This file is in the default package ONLY so you can run it easily like Main.
 * The actual Abstract Factory implementation is in the AbstractFactory package.
 */
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		ResidentEvil re = new ResidentEvil("re5");
		re.start();

		System.out.println();
		re = new ResidentEvil("re8");
		re.start();
	}
}
