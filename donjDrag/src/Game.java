import board.Board;
import characters.Guerrier;
import characters.Magicien;
import characters.Personnage;
//import Cases;

import java.util.Objects;
import java.util.Scanner;

public class Game {
    private int position;
    private int dice;

    public Game(Personnage perso) throws PersonnageHorsPlateauException {
        position = perso.getPosition();
        System.out.println(perso);
        System.out.println("Tu es sur la case " + perso.getPosition() + "/64");
        while (position < 64) {
            Board plateau = new Board();

            go();

            plateau.posBoard(position - 1);

            if (plateau.isObjectEnnemi(position - 1)) {
                System.out.println("FIIIGHT");
            }

            if (plateau.isObjectSort(position - 1) && perso instanceof Magicien) {
                System.out.println(perso.getLifeLevel());
            }

            if (plateau.isObjectArme(position - 1) && perso instanceof Guerrier) {
                System.out.println("On choppe l'arme !!");
            }

            if (plateau.isObjectPotion(position - 1)) {
                System.out.println("Glouglou et des points de vie !!");
                perso.setLifeLevel(perso.getLifeLevel() + 3);
                System.out.println("Nouveaux points de vie: " + perso.getLifeLevel());
            }



            if (position >= 64) {
                throw new PersonnageHorsPlateauException("Gagné!");
            }
        }
    }

    public void tossDice() {
        dice = 1 + (int) (Math.random() * (6));
//        dice = 5;
    }

    public void go() {
        tossDice();
        position += dice;
        System.out.println("Tu as fait " + dice);
        if (position > 64) {
            position = 64;
        }
            System.out.println("Tu es sur la case " + position + "/64");
    }

}
