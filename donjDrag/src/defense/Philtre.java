package defense;

import defense.EquipementDefensif;

public class Philtre extends EquipementDefensif {

    private String type = "philtre";
    public Philtre(String name) {
        super(5, name);
    }

    public String toString() {

        return "C'est un équipement défensif de type " + type + ", qui s'appelle " + getName() + ". Il a " + getDefenseLevel() +
                " de points de défense.";
    }

}
