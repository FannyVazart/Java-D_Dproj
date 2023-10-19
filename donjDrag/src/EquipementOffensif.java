public abstract class EquipementOffensif {
    private String type;
    private int attaqueLevel;
    private String name;

    public EquipementOffensif(String typeEq, int attaqueLevelEq, String nameEq) {
        type = typeEq;
        attaqueLevel = attaqueLevelEq;
        name = nameEq;
    }

    public String getType() {
        return type;
    }

    public int getAttaqueLevel() {
        return attaqueLevel;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "C'est un(e)) " + type + ", qui s'appelle " + name + ". et a " + attaqueLevel +
                " de points d'attaque.";
    }
}
