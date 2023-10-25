import characters.Guerrier;
import characters.Magicien;
import characters.Personnage;

import java.util.Scanner;

public class Menu {

    private String persoChoisi;
    private String nomChoisi;

    public Menu()  {
        System.out.println("Voulez-vous créer un personnage(1) ou quitter le jeu(2)?");
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        String firstChoice = choice.nextLine();// Read user input
        if (firstChoice.equals("1")) {
            selectPerso();
        } else {
            System.out.println("Vous quittez la partie.");
        }
    }
    public void selectPerso()  {

        Personnage persoUn;

        System.out.println("Quel est le nom de ton personnage ?");
        Scanner nom = new Scanner(System.in);  // Create a Scanner object
        String nomChoisi = nom.nextLine();  // Read user input

        System.out.println("Quel personnage choisis-tu: guerrier(1) ou magicien(2) ?");
        Scanner perso = new Scanner(System.in);  // Create a Scanner object
        String numChoisi = perso.nextLine();  // Read user input

        if (numChoisi.equals("1")) {
            persoChoisi = "guerrier";
//            System.out.println("Tu as choisi un guerrier.");
            persoUn = new Guerrier(nomChoisi);
        } else {
            persoChoisi = "magicien";
//            System.out.println("Tu as choisi un magicien.");
            persoUn = new Magicien(nomChoisi);
        }

        try {
            Game jeuUn = new Game(persoUn);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println("Tu as gagné, et en vie!");

            System.out.println("Tu veux rejouer ? OUI (1) / NON (2)");
            Scanner choice = new Scanner(System.in);  // Create a Scanner object
            String rejouer = choice.nextLine();// Read user input

            if (rejouer.equals("1")) {
                new Menu();
            }
        }
    }

}
