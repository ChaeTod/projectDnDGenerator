package CharacterProperties;

public class SpecificCharacter extends Character implements CharacterProperties {
    private double health = calculate_health();
    private double basicDamage = calculate_basicDamage();
    private double expirience = 0;

    public SpecificCharacter(int age, String character_name, boolean character_sex, String character_race) {
        super(age, character_name, character_sex, character_race);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getBasicDamage() {
        return basicDamage;
    }

    public void setBasicDamage(double basicDamage) {
        this.basicDamage = basicDamage;
    }

    class IncreaseStats{
        private float increaseKoef;
        private SpecificCharacter specificCharacter;

        void increseStats(String name){
            if (!name.isEmpty()){

//                specificCharacter.health =
            }
        }
    }


}
