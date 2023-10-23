package defense;

public abstract class EquipementDefensif {

    private int defenseLevel;
    private String name;

    public EquipementDefensif(int defenseLevelEq, String nameEq) {
        defenseLevel = defenseLevelEq;
        name = nameEq;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public String getName() {
        return name;
    }

}
