import board.Board;
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
            if (position >= 64) {
                throw new PersonnageHorsPlateauException("Gagné!");
            }
        }
    }

    public void tossDice() {
//        dice = 1 + (int) (Math.random() * (6));
        dice = 5;
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
