package ennemis;

import board.Board;
import board.Case;
import board.CaseVide;
import characters.Personnage;

import java.util.Scanner;

/*
Une classe abstraite représentant les ennemis rencontrés,
qui implémente l'interface Case
 */

public abstract class Ennemis implements Case {

    private String name;
    private int lifeLevel;
    private int forceAttaque;
    private int dice;

    /*
    Constructeur de la classe
     */

    protected Ennemis(String nameEnn, int lifeLevelEnn, int forceAttaqueEnn) {
        name = nameEnn;
        lifeLevel = lifeLevelEnn;
        forceAttaque = forceAttaqueEnn;
    }

    /*
    Override de la méthode interaction déclarée dans l'interface case
    @param perso de type Personnage: le personnage qui rencontre l'ennemi
    calcule le résultat de l'interaction via la méthode rounds()
    @return le niveau de vie de l'ennemi (type int)
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

    /*
    Méthode qui évalue le résultat d'une interaction personnage - ennemi
    @param perso de type Personnage Cf méthode interaction
     */

    public void rounds(Personnage perso) {
        /*
        Demande si le joueur veut attaquer l'ennemi ou fuir
         */
        System.out.println("Que veux tu faire ? Attaquer(1) ou fuir(2)?");
        Scanner choice1 = new Scanner(System.in);  // Create a Scanner object
        String attaqueFuite = choice1.nextLine();// Read user input

        /*
        Si le joueur veut attaquer, le comabt commence:
        tant que les vies du personnage et de l'ennemi sont toutes les 2
        supérieures à 0,
         */

        if (attaqueFuite.equals("1")) {
            System.out.println("Que le combat commence...");
            while (perso.getLifeLevel() > 0 && getLifeLevel() > 0) {

                /*
                La vie de l'ennemi est soustraite de la valeur des points d'attaque du joueur
                 */

                setLifeLevel(getLifeLevel() - perso.getForceAttaque());

                /*
                Si la nouvelle vie de l'ennemi est supérieure à 0, l'ennemi contre attaque
                et la vie du joueur est soustraite de la valeur des points d'attaque de l'ennemi
                 */

                if (getLifeLevel() > 0) {
                    perso.setLifeLevel(perso.getLifeLevel() - getForceAttaque());
                    System.out.println("L'ennemi t'a touché ! Tes nouveaux points de vie: " + perso.getLifeLevel());
                } else {

                    /*
                    Sinon, l'ennemi est vaincu et disparait du plateau (Cf eraseCase dans la classe Game)
                     */

                    System.out.println("Bravo, tu as vaincu l'ennemi, il a disparu !");
                }

                /*
                sout des points de vie restants du joueur
                 */

                System.out.println("Tes PV: " + perso.getLifeLevel());

                /*
                sout des points de vie de l'ennemi
                 */

                if (getLifeLevel() < 0) {
                    /*
                    = 0 si inferieur à 0
                     */
                    System.out.println("Ses PV: 0");
                } else {
                    /*
                    = points de vie réèls si supérieur à 0
                     */
                    System.out.println("Ses PV: " + getLifeLevel());
                }
            }

            /*
            Si le joueur ne veut pas attaquer, on relance lé dé et la position du joueur
            est soustraite du résultat du dé
             */

        } else {
            dice = 1 + (int) (Math.random() * (6));
            System.out.println("Tu recules de " + dice + " cases.");
            perso.setPosition(perso.getPosition() - dice);
        }
    }

    /*
    Méthodes toString, getters et setters
     */

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
