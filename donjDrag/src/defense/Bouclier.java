package defense;

import defense.EquipementDefensif;

public class Bouclier extends EquipementDefensif {

    private String type = "bouclier";
    public Bouclier(String name) {
        super(5, name);
    }

    public String toString() {

        return "C'est un équipement défensif de type " + type + ", qui s'appelle " + getName() + ". Il a " + getDefenseLevel() +
                " de points de défense.";
    }

}
