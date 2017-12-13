package Players;

public enum Creature {

    GIGANTICHAMSTER("Gigantic Hamster", 10),
    RUBBERDUCK("Rubber Duck", 15),
    PUPPY("Puppy", 40);

    public final String name;
    public final int protectionValue;

    Creature(String name, int protectionValue){
        this.name = name;
        this.protectionValue = protectionValue;
    }

    public int getProtectionValue() {
        return protectionValue;
    }

    public String getName() {
        return name;
    }
}
