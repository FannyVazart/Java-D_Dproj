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
    public void interaction(Personnage perso) {
        if ((perso.getType().equals("guerrier") && name.equals("épée")) ||
                (perso.getType().equals("guerrier") && name.equals("massue")) ||
                    (perso.getType().equals("magicien") && name.equals("éclair")) ||
                        (perso.getType().equals("magicien") && name.equals("boule de feu"))) {
                perso.setForceAttaque(perso.getForceAttaque() + getAttaqueLevel());
                System.out.println("Vos nouveaux points d'attaque: " + getAttaqueLevel());
        } else {
            System.out.println("Mais il ne se passe rien...");
        }
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
