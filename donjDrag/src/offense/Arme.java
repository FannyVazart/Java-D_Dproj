package offense;

import board.Case;
import characters.Personnage;
import offense.EquipementOffensif;

public abstract class Arme extends EquipementOffensif {

        private String type = "arme";

        public Arme(String name, int attack) {
            super(attack, name);
        }

}
