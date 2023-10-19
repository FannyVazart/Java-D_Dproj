import java.util.Scanner;

public class Game {
    private int position;
    private int dice;

    public Game(Personnage perso) /* throws Exception */ {
        position = perso.getPosition();
        System.out.println("Tu es sur la case " + perso.getPosition() + "/64");
        while (position < 64) {
            go();

//            if (position >= 65) {
//               throw new PersonnageHorsPlateauException();
//            }


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
        System.out.println("Tu es sur la case " + position + "/64");
    }

}
