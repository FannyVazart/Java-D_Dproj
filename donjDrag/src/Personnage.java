public class Personnage {
    private String type;
    private String name;
    private int lifeLevel;
    private int forceAttaque;
    private EquipementOffensif eqoff;
    private EquipementDefensif eqdef;
    private int position = 1;

    public Personnage(String typePerso, String namePerso) {
        type = typePerso;
        name = namePerso;

        if (type.equals("guerrier")) {
            lifeLevel = 10;
            forceAttaque = 10;
        } else {
            lifeLevel = 6;
            forceAttaque = 15;
        }

        System.out.println("Bienvenue " + name + ", vous allez commencer une quête majestueuse en tant " +
                "que " + type + ", voici vos statistiques:");
        System.out.println("Vos points de vie : " + lifeLevel);
        System.out.println("Vos points d'attaque : " + forceAttaque);

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

}
