package characters;

import characters.Personnage;
import offense.Arme;
import defense.Bouclier;
import offense.Massue;

public class Guerrier extends Personnage {
    private String type = "guerrier";

    public Guerrier(String name) {
        super(name, 5, 5, new Massue(), new Bouclier("Bouclier fort"));
        getPosition();
    }

    public String getType() {
        return type;
    }
}
