public abstract class EquipementDefensif {
    private String type;
    private int defenseLevel;
    private String name;

    public EquipementDefensif(String typeEq) {
        type = typeEq;
    }
    public String toString() {
        return "C'est un(e)) " + type + ", qui s'appelle " + name + ". et a " + defenseLevel +
                " de points défensifs.";
    }
}
