public class Magicien extends Personnage {

    public Magicien(String name) {
        super("magicien", name, 6, 15);
        getPosition();
    }

    public String toString() {

        return "C'est un personnage de type magicien, qui s'appelle " + getName() + ". Il a " + getLifeLevel() +
                " points de vie, et " + getForceAttaque() + " points d'attaque.";
    }
}
