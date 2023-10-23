package offense;

import offense.EquipementOffensif;

public abstract class Sort extends EquipementOffensif {
        private String type = "sort";
    public Sort(String name, int attack) {
        super(attack, name);
    }

}
