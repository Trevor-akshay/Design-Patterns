package AbstractFactory;

/**
 * "Client" in the Abstract Factory pattern.
 *
 * <p>
 * This class consumes an {@link IResidentEvilFactory} to obtain related objects
 * (hero, enemy, boss, weapon) that belong to the same game family.
 *
 * <p>
 * Important: In a classic Abstract Factory, you do NOT create multiple
 * factories
 * (HeroFactory, EnemyFactory, WeaponFactory) and pass a string into each one.
 * You select ONE family factory (RE5 or RE8) and ask it to create everything.
 */
public class ArenaFactory implements IArena {
	@Override
	public void createArena(String game) {
		// Parse once and select a single family factory once.
		Game parsedGame = Game.fromString(game);
		IResidentEvilFactory factory = ResidentEvilFactoryProvider.forGame(parsedGame);
		createArena(parsedGame, factory);
	}

	@Override
	public void createArena(Game game, IResidentEvilFactory factory) {
		// All objects come from the same factory => consistent family.
		IHero hero = factory.createHero();
		IWeapon weapon = factory.createWeapon();
		IEnemy enemy = factory.createEnemy();
		IBoss boss = factory.createBoss();

		System.out.println(hero.getName() + " started " + game.getId() + " with the Weapon: " + weapon.getName());
		System.out.println("Enemy is " + enemy.getName() + " is ready with health:" + enemy.getHealth()
				+ " and attacks " + hero.getName() + " dealing damage: " + enemy.getDamage());
		System.out.println("Boss is " + boss.getName() + " ready with health:" + boss.getHealth()
				+ " and attacks " + hero.getName() + " dealing damage: " + boss.getDamage());
	}
}
