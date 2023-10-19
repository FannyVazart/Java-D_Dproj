public class Sort extends EquipementOffensif {

    public Sort(String name) {
        super("Sort", 2, name);
    }

    public String toString() {

        return "C'est un équipement offensif de type sort, qui s'appelle " + getName() + ". Il a " + getAttaqueLevel() +
                " de points d'attaque.";
    }
}
