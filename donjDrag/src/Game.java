import java.util.Scanner;

public class Game {
    private int position;
    private int dice;

    public Game(Personnage perso) {
        position = perso.getPosition();
        while (position < 64) {
            go();
        }

        System.out.println("Veux tu rejouer ? OUI (1) / NON (2)");
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        String rejouer = choice.nextLine();// Read user input

        if (rejouer.equals("1")) {
            Menu menu2 = new Menu();
            menu2.initMenu();
        }
    }

    public void tossDice() {
        dice = 1 + (int) (Math.random() * (6));
    }

    public void go() {
        tossDice();
        position += dice;
        System.out.println("Tu as fait " + dice);
        System.out.println("Tu es sur la case " + position + "/64");
    }

}
