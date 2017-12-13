package Players;

public enum Weapon {

    LIGHTSABER("Lightsaber", 5),
    FLAMETHROWER("Flamethrower", 10),
    FIDGETSPINNER("Fidget Spinner", 1);

    public final String name;
    public final int attackValue;

    Weapon(String name, int attackValue){
        this.name = name;
        this.attackValue = attackValue;
    }

    public int getAttackValue(){
        return this.attackValue;
    }


}
