package ennemis;

import board.Board;
import board.Case;
import board.CaseVide;
import characters.Personnage;

import java.util.Scanner;


/**
 * Class common to each case containing an enemy
 * implements the Case interface
 */
public abstract class Ennemis implements Case {

    private String name;
    private int lifeLevel;
    private int forceAttaque;
    private int dice;


    /**
     * Class constructor
     * @param nameEnn Name that will be shown
     * @param lifeLevelEnn Life level of the enemy
     * @param forceAttaqueEnn Force of the enemy
     */
    protected Ennemis(String nameEnn, int lifeLevelEnn, int forceAttaqueEnn) {
        name = nameEnn;
        lifeLevel = lifeLevelEnn;
        forceAttaque = forceAttaqueEnn;
    }

    /**
     * Override of the interaction method declared in the Case interface
     * calculates the interaction result via the round() method
     * @param perso (type Personnage) the character who meets the ennemi
     * @return the life level of the ennemi
     */
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


    /**
     * method which evaluates the result of a character-enemy interaction,
     * round per round:
     * - asks if the player wants to attack or run away
     * - if the player wants to attack, the fight starts:
     *      - while the lives of the character and the enemy are both superior to 0,
     *      - the enemy's life is decreased by the value of the character's force
     *      - if the new life of the enemy is superior to 0, the enemy strikes back
     *      and the character's life is decreased by the value of the enemy's force
     *      - otherwise, the enemy is vanquished and disappears from the board (eraseCase()
     *      in the Game class)
     *      - the new life levels of both the character and the enemy are printed
     * - if the player wants to run away, the dice is tossed and the player's position is
     * decreased by the result from the dice
     * @param perso the involved character
     */

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
            System.out.println("Tu recules de " + dice + " cases.");
            perso.setPosition(perso.getPosition() - dice);
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
