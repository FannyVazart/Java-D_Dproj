public class Guerrier extends Personnage {

    private int position = 1;
    public Guerrier(String name) {
        super("guerrier", name, 10, 10);
    }

    public int getPosition() {
        return position;
    }

//    public String toString() {
//
//        return "C'est un personnage de type guerrier, qui s'appelle " + name + ". Il a " + lifeLevel +
//                " points de vie, et " + forceAttaque + " points d'attaque.";
//    }
}
