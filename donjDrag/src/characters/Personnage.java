package characters;

import defense.EquipementDefensif;
import offense.EquipementOffensif;

public abstract class Personnage {
    private String name;
    private int lifeLevel;
    private int forceAttaque;
    private EquipementOffensif eqoff;
    private EquipementDefensif eqdef;
    private int position = 1;

    protected Personnage(String namePerso, int lifeLevelPerso, int forceAttaquePerso,
                         EquipementOffensif eqoffPerso, EquipementDefensif eqdefPerso) {
        name = namePerso;
        lifeLevel = lifeLevelPerso;
        forceAttaque = forceAttaquePerso;
        eqoff = eqoffPerso;
        eqdef = eqdefPerso;
    }

    public String toString() {

        return "C'est un personnage de type " + getType() + ", qui s'appelle " + getName() + ". Il a " + getLifeLevel() +
                " points de vie, et " + getForceAttaque() + " points d'attaque.";
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public EquipementOffensif getEqoff() {
        return eqoff;
    }

    public EquipementDefensif getEqdef() {
        return eqdef;
    }
}
