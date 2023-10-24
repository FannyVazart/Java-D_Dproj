package board;
import ennemis.Dragon;
import ennemis.Ennemis;
import ennemis.Gobelin;
import ennemis.Sorcier;
import offense.*;
import potions.GdePotion;
import potions.PotionStand;
import potions.Potions;

import java.util.ArrayList;

public class Board {

    private final ArrayList<CaseVide> board = new ArrayList<>();
    private final Ennemis drag = new Dragon();
    private final Ennemis sorc = new Sorcier();
    private final Ennemis gob = new Gobelin();
    private final Arme mass = new Massue();
    private final Arme epee = new Epee();
    private final Sort eclair = new Eclair();
    private final Sort boule = new BouleFeu();
    private final Potions potSt = new PotionStand();
    private final Potions gdePot = new GdePotion();

    public Board() {

        for (int i = 0; i < 64; i++) {
            switch (i) {
                case 44, 51, 55, 61 -> board.add(i, drag);
                case 9, 19, 24, 31, 34, 35, 36, 39, 43, 46 -> board.add(i, sorc);
                case 2, 5, 8, 11, 14, 17, 20, 23, 26, 29 -> board.add(i, gob);
                case 1, 10, 4, 21, 37 -> board.add(i, mass);
                case 18, 25, 41, 52 -> board.add(i, epee);
                case 0, 3, 7, 16, 22 -> board.add(i, eclair);
                case 47, 48 -> board.add(i, boule);
                case 6, 12, 30, 32, 38, 42 -> board.add(i, potSt);
                case 27, 40 -> board.add(i, gdePot);
                default -> board.add(new CaseVide());
            }
        }

//        for (int i = 0; i < 64; i++) {
//            System.out.println("Case " + (i+1) + ": " + board.get(i));
//        }
    }

    public void posBoard(int pos) {
        System.out.println(board.get(pos));
    }

    public boolean isObjectEnnemi(int pos) {
        return board.get(pos) instanceof Ennemis;
    }

    public boolean isObjectSort(int pos) {
        return board.get(pos) instanceof Sort;
    }

    public boolean isObjectArme(int pos) {
        return board.get(pos) instanceof Arme;
    }

    public boolean isObjectPotion(int pos) {
        return board.get(pos) instanceof Potions;
    }

    public ArrayList<CaseVide> getBoard() {
        return board;
    }

    public Ennemis getDrag() {
        return drag;
    }

    public Ennemis getSorc() {
        return sorc;
    }

    public Ennemis getGob() {
        return gob;
    }

    public Arme getMass() {
        return mass;
    }

    public Arme getEpee() {
        return epee;
    }

    public Sort getEclair() {
        return eclair;
    }

    public Sort getBoule() {
        return boule;
    }

    public Potions getPotSt() {
        return potSt;
    }

    public Potions getGdePot() {
        return gdePot;
    }
}
