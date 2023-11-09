package board;

import characters.Personnage;

public interface Case {
    /**
     * Evaluates the result of the interaction between a
     * character and the item in the case
     * @param perso the character involved in the interaction
     * @return an int-type variable
     */
    int interaction(Personnage perso);
}
