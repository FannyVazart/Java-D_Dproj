import board.Board;
import characters.Personnage;
//import Cases;

import java.util.Scanner;

public class Game {
    private int position;
    private int dice;
    private Board plateau;
    private Personnage perso;

    public Game(Personnage perso) throws PersonnageHorsPlateauException {
        this.perso = perso;
        position = perso.getPosition();
        plateau = new Board();
    }

    public void play(Scanner scanner) throws PersonnageHorsPlateauException {
        System.out.println(perso);
        System.out.println("Tu es sur la case " + perso.getPosition() + "/64");
        while (position < plateau.getSize()) {

            go();
            plateau.showCaseInfo(position - 1);

            int interact = plateau.makeInteraction(position-1, perso);

            if (interact <= 0) {
//                if (plateau.getBoard().get(position - 1).interaction(perso) <= 0) {
                plateau.eraseCase(position-1);}

            if (position >= plateau.getSize()) {
                throw new PersonnageHorsPlateauException("Gagné!");
            }

            if (perso.getLifeLevel() < 0) {
                perso.setLifeLevel(0);
                System.out.println("Tu es mort...");
                break;
            }

            System.out.println("Tu veux passer au tour suivant(1) ou afficher tes stats(2) ?");
            String statChoice = scanner.nextLine();// Read user input
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
