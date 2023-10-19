public class Guerrier extends Personnage {

    public Guerrier(String name) {
        super("guerrier", name, 10, 10, new Arme("Epée"), new Bouclier("Bouclier fort"));
        getPosition();
    }

    public String toString() {

        return "C'est un personnage de type guerrier, qui s'appelle " + getName() + ". Il a " + getLifeLevel() +
                " points de vie, et " + getForceAttaque() + " points d'attaque.";
    }
}
