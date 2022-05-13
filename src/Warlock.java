public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    /**
     * Skills and Regen 
     */
    public void thirst(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with thirst (Damage - 10) (Mana cost - 10)");
        int damagePoints = 10;
        int manaCost = 10;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void bloodrage(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with bloodrage (Damage - 9) (Mana cost - 50)");
        int damagePoints = 9;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void repel(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with repel (Damage - 40) (Mana cost - 90)");
        int damagePoints = 40;
        int manaCost = 90;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Warlock: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}