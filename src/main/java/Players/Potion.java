package Players;

public enum Potion {

    BUCKFAST("Buckfast", 10),
    REDBULL("Red Bull", 20),
    NOTPOISON("Totally Not Poison", -30);

    public final String name;
    public final int healingValue;

    Potion(String name, int healingValue){
        this.name = name;
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
