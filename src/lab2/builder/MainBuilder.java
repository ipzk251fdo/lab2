package lab2.builder;

public class MainBuilder {

    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();

        Character hero = director.createHero(new HeroBuilder());
        Character enemy = director.createEnemy(new EnemyBuilder());

        System.out.println("=== HERO ===");
        hero.showCharacter();

        System.out.println("\n=== ENEMY ===");
        enemy.showCharacter();
    }
}