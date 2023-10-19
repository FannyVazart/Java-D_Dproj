    public class Arme extends EquipementOffensif {

        public Arme(String name) {
            super("Arme", 5, name);
        }

        public String toString() {

            return "C'est un équipement offensif de type arme, qui s'appelle " + getName() + ". Il a " + getAttaqueLevel() +
                    " de points d'attaque.";
        }

    }
