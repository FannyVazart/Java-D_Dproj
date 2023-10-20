import java.util.Scanner;

public class Game {
    private int position;
    private int dice;

    public Game(Personnage perso) throws PersonnageHorsPlateauException {
        position = perso.getPosition();
        System.out.println("Tu es sur la case " + perso.getPosition() + "/64");
        while (position < 64) {
            go();
            if (position >= 64) {
                throw new PersonnageHorsPlateauException("Tu as gagné !");
            }
        }



        System.out.println("Veux-tu rejouer ? OUI (1) / NON (2)");
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        String rejouer = choice.nextLine();// Read user input

        if (rejouer.equals("1")) {
            Menu menu2 = new Menu();
            menu2.Menu();
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
            System.out.println("Tu es sur la case 64/64");
        } else {
            System.out.println("Tu es sur la case " + position + "/64");
        }
    }

}
