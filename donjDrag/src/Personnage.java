public class Personnage {
    private String type;
    private String name;
    private int lifeLevel;
    private int forceAttaque;
    private String equipementOffensif;
    private String equipementDefensif;

    public Personnage(String typePerso, String namePerso, int lifeLevelPerso, int forceAttaquePerso,
                      String equipementOffensifPerso, String equipementDefensifPerso) {
        type = typePerso;
        name = namePerso;
        lifeLevel = lifeLevelPerso;
        forceAttaque = forceAttaquePerso;
        equipementOffensif = equipementOffensifPerso;
        equipementDefensif = equipementDefensifPerso;
    }
}
