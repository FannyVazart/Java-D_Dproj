package characters;

import characters.Personnage;
import defense.Philtre;
import offense.Eclair;
import offense.Sort;

public class Magicien extends Personnage {

    private String type = "magicien";
    public Magicien(String name) {
        super(name, 3, 8, new Eclair(), new Philtre("Amour"));
        getPosition();
    }

    public String getType() {
        return type;
    }

}
