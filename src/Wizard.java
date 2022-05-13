public class Wizard extends Character{
    Wizard(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    public void bloodrite(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with bloodrite (Damage - 15)(Mana Cost - 20)");
        int damagePoints = 15;
        int manaCost = 20;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void rupture(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with rupture (Damage - 15)(Mana Cost - 50)");
        int damagePoints = 15;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void lastbreath(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with lastbreath (Damage - 70)(Mana Cost - 90)");
        int damagePoints = 70;
        int manaCost = 90;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void regen(){
        super.healthPoints += 50;
        System.out.println("Heal Me!");
    }
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Wizard: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}