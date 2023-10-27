package board;

import characters.Personnage;
import ennemis.Dragon;
import ennemis.Ennemis;
import ennemis.Gobelin;
import ennemis.Sorcier;
import offense.*;
import potions.GdePotion;
import potions.PotionStand;
import potions.Potions;
import board.Case;

import java.util.ArrayList;

public class Board {

    private final ArrayList<Case> board = new ArrayList<>();

    public Board() {

        for (int i = 0; i < 64; i++) {
            switch (i) {
                case 44, 51, 55, 61 -> board.add(new Dragon());
                case 9, 19, 24, 31, 34, 35, 36, 39, 43, 46 -> board.add(new Sorcier());
                case 2, 5, 8, 11, 14, 17, 20, 23, 26, 29 -> board.add(new Gobelin());
                case 1, 10, 4, 21, 37 -> board.add(new Massue());
                case 18, 25, 41, 52 -> board.add(new Epee());
                case 0, 3, 7, 16, 22 -> board.add(new Eclair());
                case 47, 48 -> board.add(new BouleFeu());
                case 6, 12, 30, 32, 38, 42 -> board.add(new PotionStand());
                case 27, 40 -> board.add(new GdePotion());
                default -> board.add(new CaseVide());
            }
        }
    }

//            for (int i = 0; i < 64; i++) {
//                System.out.println("Case " + (i+1) + ": " + board.get(i));
//            }


    public void eraseCase(int position) {
            board.set(position, new CaseVide());
    }

    public void posBoard(int pos) {
        System.out.println(board.get(pos));
    }

    public ArrayList<Case> getBoard() {
        return board;
    }

}

