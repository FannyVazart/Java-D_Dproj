import java.util.Scanner;

public class Menu {

    private String persoChoisi;
    private String nomChoisi;

    public void Menu()  {
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

        System.out.println("Quel est le nom de votre personnage ?");
        Scanner nom = new Scanner(System.in);  // Create a Scanner object
        String nomChoisi = nom.nextLine();  // Read user input

        System.out.println("Quel personnage choisissez-vous: guerrier(1) ou magicien(2) ?");
        Scanner perso = new Scanner(System.in);  // Create a Scanner object
        String numChoisi = perso.nextLine();  // Read user input

        if (numChoisi.equals("1")) {
            persoChoisi = "guerrier";
            System.out.println("Vous avez choisi un guerrier.");
            persoUn = new Guerrier(nomChoisi);
        } else {
            persoChoisi = "magicien";
            System.out.println("Vous avez choisi un magicien.");
            persoUn = new Magicien(nomChoisi);
        }

        try {
            Game jeuUn = new Game(persoUn);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println("Vous avez gagné!");
        }
    }

}
