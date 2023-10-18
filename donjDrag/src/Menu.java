import java.util.Scanner;

public class Menu {

    public void initMenu()  {
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
        System.out.println("Quel personnage choisissez-vous: guerrier ou magicien ?");
        Scanner perso = new Scanner(System.in);  // Create a Scanner object
        String persoChoisi = perso.nextLine();  // Read user input
        System.out.println("Vous avez choisi un " + persoChoisi);
        System.out.println("Quel est le nom de votre personnage ?");
        Scanner nom = new Scanner(System.in);  // Create a Scanner object
        String nomChoisi = nom.nextLine();  // Read user input
        System.out.println("Votre nom est " + nomChoisi);
    }



    //faire des ifs si mauvais choix + rendre indépendant à la casse (ou taper 1 ou 2)
    //+ transformer en fonction et ensuite appeler dans main()
    // Instancie perso + Definir ici les caracteristiques si guerrier ou magicien


    //        if (typePerso.equals("guerrier")) {
//            lifeLevelPerso = 10;
//        } else if (typePerso.equals("magicien")) {
//            lifeLevelPerso = 6;
//        }
//
//        if (typePerso.equals("guerrier")) {
//            forceAttaquePerso = 10;
//        } else if (typePerso.equals("magicien")) {
//            forceAttaquePerso = 15;
//        }

}
