package board;
import ennemis.Dragon;
import ennemis.Gobelin;
import ennemis.Sorcier;
import offense.BouleFeu;
import offense.Eclair;
import offense.Epee;
import offense.Massue;
import potions.GdePotion;
import potions.PotionStand;

import java.util.ArrayList;

public class Board {

    private ArrayList<CaseVide> board = new ArrayList<>();
    public Board() {
        for (int i = 0; i < 64; i++) {
            board.add(new CaseVide());
        }

        board.set(44, new Dragon());
        board.set(51, new Dragon());
        board.set(55, new Dragon());
        board.set(61, new Dragon());

        board.set(9, new Sorcier());
        board.set(19, new Sorcier());
        board.set(24, new Sorcier());
        board.set(31, new Sorcier());
        board.set(34, new Sorcier());
        board.set(35, new Sorcier());
        board.set(36, new Sorcier());
        board.set(39, new Sorcier());
        board.set(43, new Sorcier());
        board.set(46, new Sorcier());

        board.set(2, new Gobelin());
        board.set(5, new Gobelin());
        board.set(8, new Gobelin());
        board.set(11, new Gobelin());
        board.set(14, new Gobelin());
        board.set(17, new Gobelin());
        board.set(20, new Gobelin());
        board.set(23, new Gobelin());
        board.set(26, new Gobelin());
        board.set(29, new Gobelin());

        board.set(1, new Massue());
        board.set(10, new Massue());
        board.set(4, new Massue());
        board.set(21, new Massue());
        board.set(37, new Massue());

        board.set(18, new Epee());
        board.set(25, new Epee());
        board.set(41, new Epee());
        board.set(52, new Epee());

        board.set(0, new Eclair());
        board.set(3, new Eclair());
        board.set(7, new Eclair());
        board.set(16, new Eclair());
        board.set(22, new Eclair());

        board.set(47, new BouleFeu());
        board.set(48, new BouleFeu());

        board.set(6, new PotionStand());
        board.set(12, new PotionStand());
        board.set(30, new PotionStand());
        board.set(32, new PotionStand());
        board.set(38, new PotionStand());
        board.set(42, new PotionStand());

        board.set(27, new GdePotion());
        board.set(40, new GdePotion());


//        for (int i = 0; i < 64; i++) {
//            System.out.println("Case " + (i+1) + ": " + board.get(i));
//        }
    }

    public void posBoard(int pos) {
        System.out.println(board.get(pos));
    }

}
