public class Philtre extends EquipementDefensif {

    public Philtre(String name) {
        super("Arme", 5, name);
    }

    public String toString() {

        return "C'est un équipement défensif de type philtre, qui s'appelle " + getName() + ". Il a " + getDefenseLevel() +
                " de points de défense.";
    }

}
