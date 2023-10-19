public class Bouclier extends EquipementDefensif {

    public Bouclier(String name) {
        super("Arme", 5, name);
    }

    public String toString() {

        return "C'est un équipement défensif de type bouclier, qui s'appelle " + getName() + ". Il a " + getDefenseLevel() +
                " de points de défense.";
    }

}
