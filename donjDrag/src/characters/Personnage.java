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

    /* Contructeur d'objet de type Personnage
    qui prend en paramètres son nom, son niveau d'attaque, sa force d'attaque
    et 2 objets de type EquipementOffensif et EquipementDefensif
     */

    protected Personnage(String namePerso, int lifeLevelPerso, int forceAttaquePerso,
                         EquipementOffensif eqoffPerso, EquipementDefensif eqdefPerso) {
        name = namePerso;
        lifeLevel = lifeLevelPerso;
        forceAttaque = forceAttaquePerso;
        eqoff = eqoffPerso;
        eqdef = eqdefPerso;
    }

    /*
    Méthode toString qui retourne une phrase explicite pour décrire l'objet créé
    avec un simple sout
     */

    public String toString() {

        return "Type: " + getType() + ". Nom: " + getName() + ". Points de vie: " + getLifeLevel() +
               ". Points d'attaque: " + getForceAttaque() + ".";
    }

    /*
    Getters et setters qui permettent d'accéder et modifier les attributs
     */

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
