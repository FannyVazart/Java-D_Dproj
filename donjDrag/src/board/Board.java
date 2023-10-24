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

    private ArrayList<CaseVide> board = new ArrayList<>();
    private Dragon drag = new Dragon();
    private Sorcier sorc = new Sorcier();
    private Gobelin gob = new Gobelin();
    private Massue mass = new Massue();
    private Epee epee = new Epee();
    private Eclair eclair = new Eclair();
    private BouleFeu boule = new BouleFeu();
    private PotionStand potSt = new PotionStand();
    private GdePotion gdePot = new GdePotion();

    public Board() {

        for (int i = 0; i < 64; i++) {
            if (i == 44 || i == 51 || i == 55 || i == 61) {
                board.add(i, drag);
            }
            if (i == 9 || i == 19 || i == 24 || i == 31 || i == 34 || i == 35 || i == 36 || i == 39 || i == 43 || i == 46 ) {
                board.add(i, sorc);
            }
            if (i == 2 || i == 5 || i == 8 || i == 11 || i == 14 || i == 17 || i == 20 || i == 23 || i == 26 || i == 29) {
                board.add(i, gob);
            }
            if (i == 1 || i == 10 || i == 4 || i == 21 || i == 37) {
                board.add(i, mass);
            }
            if (i == 18 || i == 25 || i == 41 || i == 52) {
                board.add(i, epee);
            }
            if (i == 0 || i == 3 || i == 7 || i == 16 || i == 22) {
                board.add(i, eclair);
            }
            if (i == 47 || i == 48) {
                board.add(i, boule);
            }
            if (i == 6 || i == 12 || i == 30 || i == 32 || i == 38 || i == 42) {
                board.add(i, potSt);
            }
            if (i == 27 || i == 40) {
                board.add(i, gdePot);
            } else {
                board.add(new CaseVide());
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

    public Dragon getDrag() {
        return drag;
    }

    public Sorcier getSorc() {
        return sorc;
    }

    public Gobelin getGob() {
        return gob;
    }

    public Massue getMass() {
        return mass;
    }

    public Epee getEpee() {
        return epee;
    }

    public Eclair getEclair() {
        return eclair;
    }

    public BouleFeu getBoule() {
        return boule;
    }

    public PotionStand getPotSt() {
        return potSt;
    }

    public GdePotion getGdePot() {
        return gdePot;
    }
}
