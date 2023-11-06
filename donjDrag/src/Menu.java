import characters.Guerrier;
import characters.Magicien;
import characters.Personnage;

import java.util.Scanner;

public class Menu {

    private String persoChoisi;
    private String nomChoisi;

    private Scanner scanner = new Scanner(System.in);

    public Menu()  {
        System.out.println("Veux-tu créer un personnage(1) ou quitter le jeu(2)?");
//        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        String firstChoice = scanner.nextLine();// Read user input
        if (firstChoice.equals("1")) {
            selectPerso();
        } else {
            System.out.println("Tu quittes la partie.");
        }
    }
    public void selectPerso()  {

        Personnage persoUn;
        DbCRUD accessDB = new DbCRUD();

        System.out.println("Quel est le nom de ton personnage ?");
//        Scanner nom = new Scanner(System.in);  // Create a Scanner object
        String nomChoisi = scanner.nextLine();  // Read user input

        System.out.println("Quel personnage choisis-tu: guerrier(1) ou magicien(2) ?");
        String numChoisi = scanner.nextLine();  // Read user input

        if (numChoisi.equals("1")) {
            persoChoisi = "guerrier";
            persoUn = new Guerrier(nomChoisi);
        } else {
            persoChoisi = "magicien";
//            System.out.println("Tu as choisi un magicien.");
            persoUn = new Magicien(nomChoisi);
        }

//            accessDB.createHero(persoUn);
            accessDB.getHeroes();
//            accessDB.editHero("glougloy", "guerrier", "glouglou", 9, 10);

        try {
            Game jeuUn = new Game(persoUn);
            jeuUn.play(scanner);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println("Tu as gagné, et en vie!");

            System.out.println("Tu veux rejouer ? OUI (1) / NON (2)");
            String rejouer = scanner.nextLine();// Read user input

            if (rejouer.equals("1")) {
                new Menu();
            }
        }
    }

}
