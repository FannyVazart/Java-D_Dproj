package offense;

import board.Case;
import board.CaseVide;
import characters.Personnage;

public abstract class EquipementOffensif implements Case {
    private int attaqueLevel;
    private String name;

    public EquipementOffensif(int attaqueLevelEq, String nameEq) {
        attaqueLevel = attaqueLevelEq;
        name = nameEq;
    }

    @Override
    public int interaction(Personnage perso) {
        if ((perso.getType().equals("guerrier") && name.equals("épée")) ||
                (perso.getType().equals("guerrier") && name.equals("massue"))) {
            perso.setForceAttaque(perso.getForceAttaque() + getAttaqueLevel());
            if (perso.getForceAttaque() > 10) {
                perso.setForceAttaque(10);
            }
            System.out.println("Tes nouveaux points d'attaque: " + perso.getForceAttaque());
        }
        else if ((perso.getType().equals("magicien") && name.equals("éclair")) ||
                (perso.getType().equals("magicien") && name.equals("boule de feu"))) {
            perso.setForceAttaque(perso.getForceAttaque() + getAttaqueLevel());
            if (perso.getForceAttaque() > 15) {
                perso.setForceAttaque(15);
            }
            System.out.println("Nouveaux points d'attaque: " + perso.getForceAttaque());
        } else {
            System.out.println("Mais il ne se passe rien...");
        }
        return perso.getForceAttaque();
    }

    public String toString() {

        return "C'est un(e) " + getName() + ", qui a " + getAttaqueLevel() + " points d'attaque.";
    }

    public int getAttaqueLevel() {
        return attaqueLevel;
    }

    public String getName() {
        return name;
    }


}
