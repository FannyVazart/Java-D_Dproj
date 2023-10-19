public abstract class EquipementDefensif {
    private String type;
    private int defenseLevel;
    private String name;

    public EquipementDefensif(String typeEq, int defenseLevelEq, String nameEq) {
        type = typeEq;
        defenseLevel = defenseLevelEq;
        name = nameEq;
    }

    public String getType() {
        return type;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "C'est un(e)) " + type + ", qui s'appelle " + name + ". et a " + defenseLevel +
                " de points défensifs.";
    }
}
