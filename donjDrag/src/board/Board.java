package board;
import java.util.ArrayList;

public class Board {
    private ArrayList<CaseVide> board = new ArrayList<>();
    public void generateBoard() {
        for (int i = 0; i < 64; i++) {
            board.add(new CaseVide());
        }
    }

}
