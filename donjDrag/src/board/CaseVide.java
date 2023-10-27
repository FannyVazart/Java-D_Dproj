package board;

import characters.Personnage;

public class CaseVide implements Case {


    @Override
    public int interaction(Personnage perso) {
        System.out.println("Ouf !");
        return 0;
    }

    public String toString() {
        return "C'est une case vide.";
    }
}
