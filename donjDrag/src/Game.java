import characters.Personnage;
//import Cases;

import java.util.Objects;
import java.util.Scanner;

public class Game {
//    private ArrayList<Cases> board = new ArrayList<Cases>();
//       str.add("Geeks");
//       str.add("for");
//       str.add("Geeks");
    private int position;
    private int dice;

    public Game(Personnage perso) throws PersonnageHorsPlateauException {
        position = perso.getPosition();
        System.out.println(perso);
        System.out.println("Tu es sur la case " + perso.getPosition() + "/64");
        while (position < 64) {
            go();
            if (position >= 64) {
                throw new PersonnageHorsPlateauException("Gagné!");
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
            System.out.println("Tu es sur la case " + position + "/64");
        } else {
            System.out.println("Tu es sur la case " + position + "/64");
        }
    }

}
