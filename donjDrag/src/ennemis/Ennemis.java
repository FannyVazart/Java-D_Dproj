package ennemis;

import board.Board;
import board.Case;
import board.CaseVide;
import characters.Personnage;

import java.util.Scanner;

public abstract class Ennemis implements Case {

    private String name;
    private int lifeLevel;
    private int forceAttaque;
    private int dice;

    protected Ennemis(String nameEnn, int lifeLevelEnn, int forceAttaqueEnn) {
        name = nameEnn;
        lifeLevel = lifeLevelEnn;
        forceAttaque = forceAttaqueEnn;
    }
    @Override
    public int interaction(Personnage perso) {
//        punch(perso);
        rounds(perso);
        return getLifeLevel();
    }

//    public void punch(Personnage perso) {
//        System.out.println("Que le combat commence...");
//        setLifeLevel(getLifeLevel() - perso.getForceAttaque());
//        if (getLifeLevel() > 0) {
//            perso.setLifeLevel(perso.getLifeLevel() - getForceAttaque());
//            System.out.println("L'ennemi t'a touché ! Tes nouveaux points de vie: " + perso.getLifeLevel());
//        } else {
//            System.out.println("Bravo, tu as vaincu l'ennemi, il a disparu !");
//        }
//    }

    public void rounds(Personnage perso) {
        System.out.println("Que veux tu faire ? Attaquer(1) ou fuir(2)?");
        Scanner choice1 = new Scanner(System.in);  // Create a Scanner object
        String attaqueFuite = choice1.nextLine();// Read user input

        if (attaqueFuite.equals("1")) {
            System.out.println("Que le combat commence...");
            while (perso.getLifeLevel() > 0 && getLifeLevel() > 0) {
                setLifeLevel(getLifeLevel() - perso.getForceAttaque());
                if (getLifeLevel() > 0) {
                    perso.setLifeLevel(perso.getLifeLevel() - getForceAttaque());
                    System.out.println("L'ennemi t'a touché ! Tes nouveaux points de vie: " + perso.getLifeLevel());
                } else {
                    System.out.println("Bravo, tu as vaincu l'ennemi, il a disparu !");
                }
                System.out.println("Tes PV: " + perso.getLifeLevel());

                if (getLifeLevel() < 0) {
                    System.out.println("Ses PV: 0");
                } else {
                    System.out.println("Ses PV: " + getLifeLevel());
                }
            }
        } else {
            dice = 1 + (int) (Math.random() * (6));
            perso.setPosition(perso.getPosition() - dice);
            System.out.println("Tu recules de " + dice + " cases.");
        }
    }

    public String toString() {

        return "C'est un " + getName() + "!! Niveau de vie: " + getLifeLevel() +
                ". Force d'attaque: " + getForceAttaque() + ".";
    }

    public String getName() {
        return name;
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

}
