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
        Board plateau = new Board();

        while (position < 64) {

            go();
            plateau.posBoard(position - 1);

            if (plateau.getBoard().get(position - 1).interaction(perso) <= 0) {
            plateau.eraseCase(position-1);}

            if (position >= 64) {
                throw new PersonnageHorsPlateauException("Gagné!");
            }

            if (perso.getLifeLevel() < 0) {
                perso.setLifeLevel(0);
                System.out.println("Tu es mort...");
                break;
            }

            System.out.println("Tu veux passer au tour suivant(1) ou afficher tes stats(2) ?");
            Scanner stat = new Scanner(System.in);  // Create a Scanner object
            String statChoice = stat.nextLine();// Read user input
            if (statChoice.equals("2")) {
                System.out.println("Points de vie: " + perso.getLifeLevel());
                System.out.println("Points d'attaque: " + perso.getForceAttaque());
            }
        }
    }

    public void tossDice() {
        dice = 1 + (int) (Math.random() * (6));
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
