public abstract class EquipementOffensif {
    private String type;
    private int attaqueLevel;
    private String name;

    public EquipementOffensif(String typeEq) {
        type = typeEq;
    }

    public String toString() {
        return "C'est un(e)) " + type + ", qui s'appelle " + name + ". et a " + attaqueLevel +
                " de points d'attaque.";
    }
}
