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

        return "Type: " + getType() + ". Nom: " + getName() + ". Points de vie: " + getLifeLevel() +
               ". Points d'attaque: " + getForceAttaque() + ".";
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

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
