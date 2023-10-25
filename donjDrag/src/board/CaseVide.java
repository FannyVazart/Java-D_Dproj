package board;

import characters.Personnage;

public class CaseVide implements Case {


    @Override
    public void interaction(Personnage perso) {
        System.out.println("Ouf !");
    }

    public String toString() {
        return "C'est une case vide.";
    }
}
